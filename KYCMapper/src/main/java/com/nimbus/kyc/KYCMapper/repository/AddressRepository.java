package com.nimbus.kyc.KYCMapper.repository;

import com.nimbus.kyc.KYCMapper.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
