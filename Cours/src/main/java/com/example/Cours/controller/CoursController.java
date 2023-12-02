package com.example.Cours.controller;
import com.example.Cours.Dto.ResponseDto;
import com.example.Cours.entity.Cours;
import com.example.Cours.service.CoursServiceImplement;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("api/v1/courses")
@RequiredArgsConstructor
public class CoursController {
    private final CoursServiceImplement coursService;
    @PostMapping("/add")
    public ResponseEntity<Cours> createCours(@RequestBody Cours cours) {
        Cours createdCours = coursService.createCours(cours);
        return new ResponseEntity<>(createdCours, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto> getCoursById(@PathVariable Long id) {
        ResponseDto responseDto=coursService.getCoursById(id);
        return ResponseEntity.ok(responseDto);
    }

}
