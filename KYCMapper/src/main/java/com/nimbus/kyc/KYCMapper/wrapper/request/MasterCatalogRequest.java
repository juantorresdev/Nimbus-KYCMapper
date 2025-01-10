package com.nimbus.kyc.KYCMapper.wrapper.request;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MasterCatalogRequest implements Serializable {
    @Serial
    private static final long serialVersionUID = -3648303712553310566L;
    String element;
    String value;
    String category;
    Boolean status;
    String state;
    String system;
}
