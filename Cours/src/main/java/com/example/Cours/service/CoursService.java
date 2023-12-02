package com.example.Cours.service;

import com.example.Cours.Dto.ResponseDto;
import com.example.Cours.entity.Cours;



public interface CoursService {

     Cours createCours(Cours cours) ;

    ResponseDto getCoursById(Long id) ;


}
