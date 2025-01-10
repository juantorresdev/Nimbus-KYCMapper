package com.nimbus.kyc.KYCMapper.wrapper.response;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CandidateResponse implements Serializable {
    @Serial
    private static final long serialVersionUID = -6781815793304067846L;
    String idCandidate;
    String firstName;
    String middleName;
    String lastName;
    Boolean gender;
    LocalDate birthDate;
    String nationalID;
    String digitalSignature;
    Boolean status;
    String state;
    Integer consecutiveID;
    Boolean dbStatus;
}
