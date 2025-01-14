package com.nimbus.kyc.KYCMapper.service.impl;

import com.nimbus.kyc.KYCMapper.entity.MasterCatalog;
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
    
    public MasterCatalog createMasterCatalog(MasterCatalog masterCatalog) {
        logger.info("Creating master catalog element");
        MasterCatalog masterCatalogEntity = new MasterCatalog();
        return masterCatalogEntity;
    }
    
    public MasterCatalog updateMasterCatalog(MasterCatalog masterCatalog) {
        logger.info("Updating master catalog element");
        MasterCatalog masterCatalogEntity = new MasterCatalog();
        return masterCatalogEntity;
    }
    
    public MasterCatalog deleteMasterCatalog(MasterCatalog masterCatalog) {
        logger.info("Deleting master catalog element");
        MasterCatalog masterCatalogEntity = new MasterCatalog();
        return masterCatalogEntity;
    }
    
    public MasterCatalog getMasterCatalog(MasterCatalog masterCatalog) {
        logger.info("Retrieving master catalog element");
        MasterCatalog masterCatalogEntity = new MasterCatalog();
        return masterCatalogEntity;
    }
    
    public List<MasterCatalog> getMasterCatalogs() {
        logger.info("Retrieving all master catalog elements");
        List<MasterCatalog> masterCatalogEntityList = new ArrayList<>();
        return masterCatalogEntityList;
    }

    public List<MasterCatalog> getMasterCatalogsByCriteria(Long masterId) {
        logger.info("Retrieving master catalog elements by criteria");
        List<MasterCatalog> masterCatalogEntityList = new ArrayList<>();
        return masterCatalogEntityList;
    }

}
