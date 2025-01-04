package com.nimbus.kyc.KYCMapper.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.Instant;

@Getter
@Setter
@Entity
public class Address {
    @Id
    @Column(name = "idAddress", nullable = false, length = 36)
    private String idAddress;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "Candidate_idCandidate", nullable = false)
    private Candidate candidateIdcandidate;

    @Column(name = "Country", nullable = false, length = 45)
    private String country;

    @Column(name = "StateProvince", nullable = false, length = 45)
    private String stateProvince;

    @Column(name = "Municipality", length = 45)
    private String municipality;

    @Column(name = "Neighborhood", length = 45)
    private String neighborhood;

    @Column(name = "ExternalNumber", length = 45)
    private String externalNumber;

    @Column(name = "InternalNumber", length = 45)
    private String internalNumber;

    @Column(name = "LocationReference", length = 45)
    private String locationReference;

    @Column(name = "Zipcode", nullable = false, length = 5)
    private String zipcode;

    @Column(name = "CreateDate", nullable = false)
    private Instant createDate;

    @Column(name = "LatestUpdate", nullable = false)
    private Instant latestUpdate;

    @Column(name = "Status", nullable = false)
    private Boolean status = false;

    @Column(name = "State", nullable = false, length = 45)
    private String state;

    @Column(name = "ConsecutiveID", nullable = false)
    private Integer consecutiveID;

}