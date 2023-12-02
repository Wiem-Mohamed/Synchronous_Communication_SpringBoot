package com.example.Enseignant.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Enseignant {
    @Id
    private long id;
    private String nom;
    private String prenom;
    private String mail;
   private LocalDate dateNaissance;
    private String grade;
}
