package com.nimbus.kyc.KYCMapper.wrapper.request;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BiometricRequest implements Serializable {
    @Serial
    private static final long serialVersionUID = -2305917846544725955L;
    String type;
    String location;
    Boolean status;
    String state;
}
