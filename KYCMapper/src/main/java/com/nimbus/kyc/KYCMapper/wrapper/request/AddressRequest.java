package com.nimbus.kyc.KYCMapper.wrapper.request;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AddressRequest implements Serializable {
    @Serial
    private static final long serialVersionUID = 8559260448148560834L;
    String country;
    String stateProvince;
    String municipality;
    String neighborhood;
    String externalNumber;
    String internalNumber;
    String locationReference;
    String zipcode;
}
