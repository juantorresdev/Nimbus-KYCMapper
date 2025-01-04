package com.nimbus.kyc.KYCMapper.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Candidate {
    @Id
    @Column(name = "idCandidate", nullable = false, length = 36)
    private String idCandidate;

    @Column(name = "FirstName", nullable = false, length = 50)
    private String firstName;

    @Column(name = "MiddleName", length = 50)
    private String middleName;

    @Column(name = "LastName", nullable = false, length = 50)
    private String lastName;

    @Column(name = "Gender", nullable = false)
    private Boolean gender = false;

    @Column(name = "BirthDate", nullable = false)
    private LocalDate birthDate;

    @Column(name = "NationalID", nullable = false, length = 45)
    private String nationalID;

    @Column(name = "DigitalSignature", nullable = false, length = 45)
    private String digitalSignature;

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