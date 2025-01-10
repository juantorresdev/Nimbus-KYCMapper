package com.nimbus.kyc.KYCMapper.wrapper.request;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CandidateRequest implements Serializable {
    @Serial
    private static final long serialVersionUID = 364187413234856958L;
    String firstName;
    String middleName;
    String lastName;
    Boolean gender;
    LocalDate birthDate;
    String nationalID;
    String digitalSignature;
    Boolean status;
    String state;
}
