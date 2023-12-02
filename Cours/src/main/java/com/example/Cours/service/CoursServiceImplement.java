package com.example.Cours.service;

import com.example.Cours.Dto.CoursDto;
import com.example.Cours.Dto.EnseignantDto;
import com.example.Cours.Dto.ResponseDto;
import com.example.Cours.entity.Cours;
import com.example.Cours.repository.CoursRepo;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class CoursServiceImplement implements CoursService{
    private CoursRepo coursrepo;
    private RestTemplate restTemplate;

    @Override
    public Cours createCours(Cours cours) {
        return coursrepo.save(cours);
    }

    @Override
    public ResponseDto getCoursById(Long id) {
        ResponseDto responseDto = new ResponseDto();
        Cours cours = coursrepo.findById(id).get();
        CoursDto coursDto = mapToCours(cours);
        ResponseEntity<EnseignantDto> responseEntity = restTemplate
                .getForEntity("http://localhost:8083/api/v1/enseignants/" + cours.getIdEns(),
                       EnseignantDto.class);
        EnseignantDto enseignantDto = responseEntity.getBody();
        System.out.println(responseEntity.getStatusCode());
        responseDto.setCours(coursDto);
        responseDto.setEnseignant(enseignantDto);
        return responseDto;
    }

    private CoursDto mapToCours(Cours cours) {
        CoursDto coursDto = new CoursDto();
        coursDto.setId(cours.getId());
        coursDto.setContenu(cours.getContenu());
        coursDto.setDateDepot(cours.getDateDepot());
        return coursDto;
    }
}
