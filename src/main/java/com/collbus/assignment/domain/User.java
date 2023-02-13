package com.collbus.assignment.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String nickname;

    @Enumerated(EnumType.STRING)
    @Getter
    private AccountType account_type;
    private int account_id;
    private Boolean quit;
}
