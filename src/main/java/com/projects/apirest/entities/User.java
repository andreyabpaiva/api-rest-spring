package com.projects.apirest.entities;


import jakarta.persistence.*;

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

    public User(String name, Long account, Agency agency) {
        this.name = name;
        this.account = account;
        this.agency = agency;
    }

    public User() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAccount() {
        return account;
    }

    public void setAccount(Long account) {
        this.account = account;
    }

    public Agency getAgency() {
        return agency;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;
    }


}
