package com.example.Cours.Dto;

import lombok.*;
import org.hibernate.annotations.NaturalId;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EnseignantDto {
    private long id;
    private String nom;
    private String prenom;
    private String mail;
    private LocalDate dateNaissance;
    private String grade;
}
