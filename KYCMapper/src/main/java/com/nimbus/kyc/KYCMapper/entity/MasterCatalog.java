package com.nimbus.kyc.KYCMapper.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
public class MasterCatalog {
    @Id
    @Column(name = "idMasterCatalog", nullable = false, length = 36)
    private String idMasterCatalog;

    @Column(name = "Element", nullable = false, length = 50)
    private String element;

    @Column(name = "Value", nullable = false, length = 50)
    private String value;

    @Column(name = "Category", nullable = false, length = 50)
    private String category;

    @Column(name = "Status", nullable = false)
    private Boolean status = false;

    @Column(name = "State", nullable = false, length = 45)
    private String state;

    @Column(name = "System", nullable = false, length = 45)
    private String system;

    @Column(name = "CreateDate", nullable = false)
    private Instant createDate;

    @Column(name = "LatestUpdate", nullable = false)
    private Instant latestUpdate;

    @Column(name = "ConsecutiveID", nullable = false)
    private Integer consecutiveID;

}