package com.nimbus.kyc.KYCMapper.controller;

import com.nimbus.kyc.KYCMapper.dto.CatalogElementDTO;
import com.nimbus.kyc.KYCMapper.service.MasterCatalogService;
import com.nimbus.kyc.KYCMapper.wrapper.request.MasterCatalogRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MasterCatalogController {

    private static final Logger logger = LoggerFactory.getLogger(MasterCatalogController.class);

    @Autowired
    MasterCatalogService masterCatalogService;

    @GetMapping("/element/{id}")
    public ResponseEntity<CatalogElementDTO> getCatalogElement(@RequestParam("id") int value){

        logger.info("getCatalogElement");
        return ResponseEntity.ok().build();

    }

    @GetMapping("/getElements")
    public ResponseEntity<List<String>> getCatalogElements(){

        logger.info("getCatalogElements");
        logger.debug("getCatalogElements");
        logger.error("getCatalogElements");
        logger.warn("getCatalogElements");
        logger.trace("getCatalogElements");
        return ResponseEntity.ok().body(new ArrayList<String>());

    }

    @PostMapping("/element")
    public ResponseEntity<CatalogElementDTO> createCatalogElement(@RequestBody MasterCatalogRequest masterCatalogRequest){

        logger.info("Create catalog element");
        return ResponseEntity.ok().build();

    }

    @PutMapping("/element/{id}")
    public ResponseEntity<CatalogElementDTO> updateCatalogElement(@RequestBody MasterCatalogRequest masterCatalogRequest){

        logger.info("Edit catalog element");
        return ResponseEntity.ok().build();

    }

    @DeleteMapping("/element/{id}")
    public ResponseEntity<CatalogElementDTO> deleteCatalogElement(@RequestParam("id") int id){
        logger.info("Logical delete catalog element");
        return ResponseEntity.ok().build();
    }
}