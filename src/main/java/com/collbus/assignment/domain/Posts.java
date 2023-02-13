package com.collbus.assignment.domain;

import javax.persistence.*;

@Entity
public class Posts {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String content;

}
