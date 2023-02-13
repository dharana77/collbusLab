package com.collbus.assignment.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Posts {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String content;

    @OneToMany(cascade =  CascadeType.ALL, fetch= FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private List<Likes> likes;

    @Column(name = "account_type")
    private String accountType;

    private Long createdUserId;
}
