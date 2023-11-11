package com.example.application.data;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import java.time.LocalDate;

@Entity(name = "person")
public class SamplePerson extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "version")
    private Integer version;

    private String name;

    @Override
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
