package com.collbus.assignment.domain;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String nickname;

    @Enumerated(EnumType.STRING)
    private AccountType account_type;
    private int account_id;
    private Boolean quit;

}
