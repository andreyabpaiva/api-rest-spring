package com.projects.apirest.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique=true,nullable=false)
    private String name;
    @Column(unique=true,nullable=false,length=7)
    private Long account;

    @ManyToOne
    @JoinColumn(name="agency_id")
    private Agency agency;

}
