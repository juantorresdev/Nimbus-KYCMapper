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
public class DeviceResponse implements Serializable {
    @Serial
    private static final long serialVersionUID = -3739004367405818728L;
    String idDevice;
    Candidate candidateIdcandidate;
    String brand;
    String model;
    Boolean status;
    String state;
    Integer consecutiveID;
    Boolean dbStatus;
}
