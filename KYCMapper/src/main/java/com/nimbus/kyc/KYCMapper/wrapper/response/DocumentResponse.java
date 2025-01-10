package com.nimbus.kyc.KYCMapper.wrapper.response;

import com.nimbus.kyc.KYCMapper.entity.Candidate;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DocumentResponse implements Serializable {
    @Serial
    private static final long serialVersionUID = 1769317893355205350L;
    String idDocument;
    Candidate candidateIdcandidate;
    String documentFile;
    String type;
    String location;
    String metadata;
    LocalDate expiracyDate;
    Boolean status;
    String state;
    Integer consecutiveID;
    Boolean dbStatus;
}
