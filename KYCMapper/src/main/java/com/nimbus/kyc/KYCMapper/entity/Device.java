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
public class Device {
    @Id
    @Column(name = "idDevice", nullable = false, length = 36)
    private String idDevice;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "Candidate_idCandidate", nullable = false)
    private Candidate candidateIdcandidate;

    @Column(name = "Brand", nullable = false, length = 45)
    private String brand;

    @Column(name = "Model", nullable = false, length = 45)
    private String model;

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