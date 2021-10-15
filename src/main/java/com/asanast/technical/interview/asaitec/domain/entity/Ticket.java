package com.asanast.technical.interview.asaitec.domain.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "ticket_name")
    private String ticketName;
    private String comment;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User createdBy;

    @OneToMany(fetch = FetchType.EAGER)
    private List<User> assignedUsers;

}
