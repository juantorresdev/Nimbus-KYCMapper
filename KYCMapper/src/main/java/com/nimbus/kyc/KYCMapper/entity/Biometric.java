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
@Table(name = "Biometrics")
public class Biometric {
    @Id
    @Column(name = "idBiometrics", nullable = false, length = 26)
    private String idBiometrics;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "Candidate_idCandidate", nullable = false)
    private Candidate candidateIdcandidate;

    @Column(name = "Type", nullable = false, length = 45)
    private String type;

    @Column(name = "Location", nullable = false, length = 500)
    private String location;

    @Column(name = "Status", nullable = false)
    private Boolean status = false;

    @Column(name = "State", nullable = false, length = 45)
    private String state;

    @Column(name = "CreateDate", nullable = false)
    private Instant createDate;

    @Column(name = "LatestUpdate", nullable = false)
    private Instant latestUpdate;

    @Column(name = "ConsecutiveID", nullable = false)
    private Integer consecutiveID;

}