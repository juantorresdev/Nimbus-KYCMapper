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
public class ContactResponse implements Serializable {
    @Serial
    private static final long serialVersionUID = 872583875271654359L;
    String idContact;
    Candidate candidateIdcandidate;
    String phone;
    String email;
    Boolean status;
    String state;
    Integer consecutiveID;
    Boolean dbStatus;
}
