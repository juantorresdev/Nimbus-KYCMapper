package com.nimbus.kyc.KYCMapper.wrapper.response;

import com.nimbus.kyc.KYCMapper.entity.Candidate;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AddressResponse implements Serializable {
    @Serial
    private static final long serialVersionUID = 5198938352313780885L;
    String idAddress;
    Candidate candidateIdcandidate;
    String country;
    String stateProvince;
    String municipality;
    String neighborhood;
    String externalNumber;
    String internalNumber;
    String locationReference;
    String zipcode;
    Boolean status;
    String state;
    Integer consecutiveID;
    Boolean dbStatus;
}
