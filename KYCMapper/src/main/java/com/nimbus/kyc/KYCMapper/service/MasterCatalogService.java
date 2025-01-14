package com.nimbus.kyc.KYCMapper.service;

import com.nimbus.kyc.KYCMapper.entity.MasterCatalog;

import java.util.ArrayList;
import java.util.List;

public interface MasterCatalogService {

    public MasterCatalog createMasterCatalog(MasterCatalog masterCatalog);

    public MasterCatalog updateMasterCatalog(MasterCatalog masterCatalog);

    public MasterCatalog deleteMasterCatalog(MasterCatalog masterCatalog);

    public MasterCatalog getMasterCatalog(MasterCatalog masterCatalog);

    public List<MasterCatalog> getMasterCatalogs();

    public List<MasterCatalog> getMasterCatalogsByCriteria(Long masterId);
}
