package com.collbus.assignment.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String nickname;
    private String account_type;
    private int account_id;
    private Boolean quit;

}
