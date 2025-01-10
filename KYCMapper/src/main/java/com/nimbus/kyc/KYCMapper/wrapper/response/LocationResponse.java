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
public class LocationResponse implements Serializable {
    @Serial
    private static final long serialVersionUID = -6669586003661644024L;
    Integer id;
    Candidate candidateIdcandidate;
    Boolean status;
    String state;
    Integer consecutiveID;
    Boolean dbStatus;
}
