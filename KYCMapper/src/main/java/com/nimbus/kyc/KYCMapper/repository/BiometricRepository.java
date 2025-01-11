package com.nimbus.kyc.KYCMapper.repository;

import com.nimbus.kyc.KYCMapper.entity.Biometric;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BiometricRepository extends JpaRepository<Biometric, Long> {
}
