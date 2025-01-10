package com.nimbus.kyc.KYCMapper.wrapper.request;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ContactRequest implements Serializable {
    @Serial
    private static final long serialVersionUID = -1567359112807901788L;
    String phone;
    String email;
    Boolean status;
    String state;
}
