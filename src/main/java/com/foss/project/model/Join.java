package com.foss.project.model;

import javax.persistence.*;

@Entity
public class Join {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long join_id;

    @ManyToOne
    @JoinColumn(name="join_user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name="join_group_id")
    private Group group;

}
