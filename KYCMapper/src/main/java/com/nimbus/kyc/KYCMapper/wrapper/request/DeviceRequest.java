package com.nimbus.kyc.KYCMapper.wrapper.request;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DeviceRequest implements Serializable {
    @Serial
    private static final long serialVersionUID = -2271242557433466612L;
    String brand;
    String model;
}
