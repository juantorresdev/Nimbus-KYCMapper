package com.nimbus.kyc.KYCMapper.repository;

import com.nimbus.kyc.KYCMapper.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long> {
}
