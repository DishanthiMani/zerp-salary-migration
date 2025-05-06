package com.zirius.zerp.controller;

import com.zirius.zerp.service.CompanyConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/company-migration")
public class CompanyDataMigrationController {

    @Autowired
    private CompanyConfigService companyConfigService;

    @GetMapping("/companyData")
    public ResponseEntity<Boolean> fetchWholeCompanyData(@RequestParam("companyId") Integer companyId) {
        System.out.println("Received request for companyId: " + companyId);
        try {
            boolean response = companyConfigService.fetchWholeCompanyData(companyId);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.internalServerError().body(false);
        }
    }

    @GetMapping("/fetch")
    public ResponseEntity<Boolean> fetchCompanyConfig(@RequestParam("companyId") Integer companyId) {
        System.out.println("Received request for companyId: " + companyId);
        try {
            boolean response = companyConfigService.fetchCompanyConfigAsJson(companyId);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.internalServerError().body(false);
        }
    }
}

