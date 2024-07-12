package com.projects.apirest.entities;

import jakarta.persistence.*;

@Entity
@Table(name="tb_agency")
public class Agency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique=true, nullable=false)
    private String name;

    public Agency(Long id) {
        this.id=id;
    }

    public Agency() {
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
}
