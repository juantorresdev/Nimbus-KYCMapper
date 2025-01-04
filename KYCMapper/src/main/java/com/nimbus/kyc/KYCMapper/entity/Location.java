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
public class Location {
    @Id
    @Column(name = "idLocation", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "Candidate_idCandidate", nullable = false)
    private Candidate candidateIdcandidate;

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

/*
 TODO [Reverse Engineering] create field to map the 'Coordinates' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "Coordinates", columnDefinition = "point not null")
    private Object coordinates;
*/
}