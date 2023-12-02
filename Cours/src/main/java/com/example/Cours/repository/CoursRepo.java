package com.example.Cours.repository;

import com.example.Cours.entity.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursRepo extends JpaRepository<Cours,Long> {
}