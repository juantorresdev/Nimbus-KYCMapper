package com.nimbus.kyc.KYCMapper.repository;

import com.nimbus.kyc.KYCMapper.entity.MasterCatalog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MasterCatalogRepository extends JpaRepository<MasterCatalog, Long> {
}
