package com.nimbus.kyc.KYCMapper.controller;

import com.nimbus.kyc.KYCMapper.dto.CatalogElementDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MasterCatalogController {

    private static final Logger logger = LoggerFactory.getLogger(MasterCatalogController.class);

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

}
