package com.nimbus.kyc.KYCMapper.repository;

import com.nimbus.kyc.KYCMapper.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
