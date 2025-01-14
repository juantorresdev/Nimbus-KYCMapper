package com.nimbus.kyc.KYCMapper.service.impl;

import com.nimbus.kyc.KYCMapper.dto.CatalogElementDTO;
import com.nimbus.kyc.KYCMapper.repository.MasterCatalogRepository;
import com.nimbus.kyc.KYCMapper.service.MasterCatalogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MasterCatalogServiceImpl implements MasterCatalogService {

    @Autowired
    MasterCatalogRepository masterCatalogRepository;
    
    private static final Logger logger = LoggerFactory.getLogger(MasterCatalogServiceImpl.class);
    
    public CatalogElementDTO createMasterCatalog(CatalogElementDTO catalogElementDTO) {
        logger.info("Creating master catalog element");
        CatalogElementDTO masterCatalogElementDTO = new CatalogElementDTO();
        return masterCatalogElementDTO;
    }
    
    public CatalogElementDTO updateMasterCatalog(CatalogElementDTO catalogElementDTO) {
        logger.info("Updating master catalog element");
        CatalogElementDTO masterCatalogElementDTO = new CatalogElementDTO();
        return masterCatalogElementDTO;
    }
    
    public CatalogElementDTO deleteMasterCatalog(CatalogElementDTO catalogElementDTO) {
        logger.info("Deleting master catalog element");
        CatalogElementDTO masterCatalogElementDTO = new CatalogElementDTO();
        return masterCatalogElementDTO;
    }
    
    public CatalogElementDTO getMasterCatalog(CatalogElementDTO catalogElementDTO) {
        logger.info("Retrieving master catalog element");
        CatalogElementDTO masterCatalogElementDTO = new CatalogElementDTO();
        return masterCatalogElementDTO;
    }
    
    public List<CatalogElementDTO> getMasterCatalogs() {
        logger.info("Retrieving all master catalog elements");
        List<CatalogElementDTO> catalogElementDTOS = new ArrayList<>();
        return catalogElementDTOS;
    }

    public List<CatalogElementDTO> getMasterCatalogsByCriteria(Long masterId) {
        logger.info("Retrieving master catalog elements by criteria");
        List<CatalogElementDTO> catalogElementDTOS = new ArrayList<>();
        return catalogElementDTOS;
    }

}
