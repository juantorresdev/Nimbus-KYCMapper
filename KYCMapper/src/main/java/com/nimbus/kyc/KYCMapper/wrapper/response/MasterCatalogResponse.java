package com.nimbus.kyc.KYCMapper.wrapper.response;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MasterCatalogResponse implements Serializable {
    @Serial
    private static final long serialVersionUID = -5946192530623784138L;
    String idMasterCatalog;
    String element;
    String value;
    String category;
    Boolean status;
    String state;
    String system;
    Integer consecutiveID;
    Boolean dbStatus;
}
