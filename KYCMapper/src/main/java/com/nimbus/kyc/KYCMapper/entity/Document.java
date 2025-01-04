package com.nimbus.kyc.KYCMapper.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Document {
    @Id
    @Column(name = "idDocument", nullable = false, length = 36)
    private String idDocument;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "Candidate_idCandidate", nullable = false)
    private Candidate candidateIdcandidate;

    @Column(name = "DocumentFile", nullable = false, length = 45)
    private String documentFile;

    @Column(name = "Type", nullable = false, length = 45)
    private String type;

    @Column(name = "Location", nullable = false, length = 500)
    private String location;

    @Column(name = "Metadata", nullable = false, length = 500)
    private String metadata;

    @Column(name = "ExpiracyDate")
    private LocalDate expiracyDate;

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