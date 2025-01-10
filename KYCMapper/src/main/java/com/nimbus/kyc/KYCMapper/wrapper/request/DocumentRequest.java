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
public class DocumentRequest implements Serializable {
    @Serial
    private static final long serialVersionUID = -6975216060210184691L;
    String documentFile;
    String type;
    String location;
    String metadata;
    LocalDate expiracyDate;
    Boolean status;
    String state;
}
