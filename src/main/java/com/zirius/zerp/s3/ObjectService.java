package com.zirius.zerp.s3;

import com.zirius.objectstore.Client;
import com.zirius.objectstore.S3Ref;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.nio.file.Files;

public class ObjectService {

    boolean isBeta = false;
    boolean isDev= false;

    public ObjectService(boolean isBeta) {
        this.isBeta = isBeta;
    }


    public byte[] downloadFileFromObjectStorage(String uuid, Integer companyId) {

        try {
            String superAdminLoginId = "",superAdminPass = "";
            if (isBeta) {
                superAdminLoginId = "superadmin@zirius.no";
                superAdminPass = "gOi6q+bCQKoIS9zyxpzG0A==";
                Client.setBeta_url("http://11.0.3.72:8080/ObjectStoreServiceAws-1.0/ObjectService");
            } else {
                superAdminLoginId = "superadmin@zirius.no";
                superAdminPass = "3KQ/8/82M1ElT+ytXLcEIw==";

                Client.setProd_url("http://12.0.13.238:8080/ObjectStoreServiceAws-1.0/ObjectService");
                //Client.setProd_url("http://10.180.7.28:8080/s3/ObjectService");
            }
            Client client = new Client(superAdminLoginId, superAdminPass, companyId.intValue(), isBeta);
            return client.getFile(uuid, Client.type_original_file);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception :downloadFileFromObjectStorage "+e);
            return null;
        }
    }

    public S3Ref uploadFileToObjectStorage(String jsonString, Integer companyId, String fileName) {

        try {

            File tempFile = File.createTempFile("company_config_" + companyId, ".json");
            try (FileWriter writer = new FileWriter(tempFile)) {
                writer.write(jsonString);
            }

            byte[] fileBytes = Files.readAllBytes(tempFile.toPath());

            String superAdminLoginId = "",superAdminPass = "";
            superAdminLoginId = "superadmin@zirius.no";
            superAdminPass = "gOi6q+bCQKoIS9zyxpzG0A==";
            Client.setBeta_url("http://zerpcbe.in/ObjectStoreServiceAws-1.0/ObjectService");
            Client client = new Client(superAdminLoginId, superAdminPass, companyId.intValue(), false);
            //client.setUrl("http://zerpcbe.in/ObjectStoreServiceAws-1.0/ObjectService");
            return client.uploadFile(fileBytes.toString().getBytes(), fileName, Client.type_original_file);
        } catch (Exception e) {
            System.out.println("Exception :uploadFileToObjectStorage "+e);
            e.printStackTrace();
            return null;
        }
    }


    public boolean getFileFromObjectStorage(String filePath, Integer companyId, String Uid) {
        FileOutputStream fos;

        try {
            byte[] fileContent = this.downloadFileFromObjectStorage(Uid, companyId);

            if (fileContent != null) {
                filePath = filePath.replace(" ", "");
                File f = new File(filePath.replace(" ", ""));
                f.getParentFile().mkdirs();
                f.createNewFile();
                fos = new FileOutputStream(filePath);
                fos.write(fileContent);
                fos.close();
                System.out.println("Done");
                return true;
            }
        } catch (Exception e) {
            System.out.println("Exp" + e);
        }
        return false;
    }
}
