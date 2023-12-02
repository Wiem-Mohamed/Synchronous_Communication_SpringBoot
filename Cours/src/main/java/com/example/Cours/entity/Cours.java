package com.example.Cours.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String contenu;
    private LocalDate dateDepot;
    private long idEns;
    @PrePersist
    public void setDateDepotOnCreate() {

            this.dateDepot = LocalDate.now();

    }



}
