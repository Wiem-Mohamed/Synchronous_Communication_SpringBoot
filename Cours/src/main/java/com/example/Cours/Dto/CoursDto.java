package com.example.Cours.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CoursDto {
    private long id;
    private String contenu;
    private LocalDate dateDepot;
    private long idEns;
}
