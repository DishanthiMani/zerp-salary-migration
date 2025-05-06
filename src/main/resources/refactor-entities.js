const fs = require("fs");
const path = require("path");

// Convert UPPER_CASE to camelCase
function toCamelCase(str) {
    const parts = str.toLowerCase().split("_");
    return parts[0] + parts.slice(1).map(p => p.charAt(0).toUpperCase() + p.slice(1)).join("");
}

// Regex pattern to find all private fields (of any type) in UPPER_CASE
const fieldRegex = /^\s*private\s+(\S+)\s+([A-Z0-9_]+);/gm;

function addColumnImportIfNeeded(content) {
    // Check if @Column import is already present
    const importRegex = /import\s+javax\.persistence\.Column;/;
    if (!importRegex.test(content)) {
        // Add @Column import at the beginning of the file
        content = "import javax.persistence.Column;\n" + content;
    }
    return content;
}

function refactorJavaFile(filePath) {
    let content = fs.readFileSync(filePath, "utf8");

    // Ensure @Column import is at the top of the file
    content = addColumnImportIfNeeded(content);

    let result = "";
    let lastIndex = 0;
    let match;

    while ((match = fieldRegex.exec(content)) !== null) {
        const [fullMatch, type, originalField] = match;
        const camelField = toCamelCase(originalField);

        // Skip if it's already camelCase
        if (camelField === originalField) continue;

        // Add everything up to match
        result += content.slice(lastIndex, match.index);

        // Add @Column + refactored field line
        result += `    @Column(name = "${originalField}")\n`;
        result += `    private ${type} ${camelField};\n`;

        lastIndex = fieldRegex.lastIndex;
    }

    result += content.slice(lastIndex);

    if (result !== content) {
        fs.writeFileSync(filePath, result, "utf8");
        console.log(`Updated: ${filePath}`);
    }
}

function walkDirectory(dirPath) {
    fs.readdirSync(dirPath).forEach(file => {
        const fullPath = path.join(dirPath, file);
        const stats = fs.statSync(fullPath);
        if (stats.isDirectory()) {
            walkDirectory(fullPath);
        } else if (file.endsWith(".java")) {
            refactorJavaFile(fullPath);
        }
    });
}

// ---- CHANGE THIS TO YOUR ENTITY FOLDER PATH ----
const targetFolder = "./src/main/java/com/zirius/zerp/model";
walkDirectory(targetFolder);
