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
public class BiometricResponse implements Serializable {
    @Serial
    private static final long serialVersionUID = 3856679027824466171L;
    String idBiometrics;
    Candidate candidateIdcandidate;
    String type;
    String location;
    Boolean status;
    String state;
    Integer consecutiveID;
    Boolean dbStatus;
}
