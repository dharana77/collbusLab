package com.collbus.assignment.domain;

import javax.persistence.*;

@Entity
public class Likes {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "post_id")
    private Posts post;
}
