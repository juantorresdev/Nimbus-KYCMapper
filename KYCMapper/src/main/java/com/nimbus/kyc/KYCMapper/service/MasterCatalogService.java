package com.nimbus.kyc.KYCMapper.service;

import com.nimbus.kyc.KYCMapper.dto.CatalogElementDTO;

import java.util.List;

public interface MasterCatalogService {

    public CatalogElementDTO createMasterCatalog(CatalogElementDTO catalogElementDTO);

    public CatalogElementDTO updateMasterCatalog(CatalogElementDTO catalogElementDTO);

    public CatalogElementDTO deleteMasterCatalog(CatalogElementDTO catalogElementDTO);

    public CatalogElementDTO getMasterCatalog(CatalogElementDTO catalogElementDTO);

    public List<CatalogElementDTO> getMasterCatalogs();

    public List<CatalogElementDTO> getMasterCatalogsByCriteria(Long masterId);
}
