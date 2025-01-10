package com.nimbus.kyc.KYCMapper.wrapper.request;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LocationRequest implements Serializable {
    @Serial
    private static final long serialVersionUID = 287228346432128927L;
    Boolean status;
    String state;
}
