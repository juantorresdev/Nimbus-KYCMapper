package com.nimbus.kyc.KYCMapper.controller;

import com.nimbus.kyc.KYCMapper.dto.CatalogElementDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MasterCatalogController {

    @GetMapping("/element/{id}")
    public ResponseEntity<CatalogElementDTO> getCatalogElement(@RequestParam("id") int value){

        return ResponseEntity.ok().build();

    }

    @GetMapping("/getElements")
    public ResponseEntity<List<String>> getCatalogElements(){

        return ResponseEntity.ok().body(new ArrayList<String>());

    }

}
