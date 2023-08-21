package spring.projects.footballresultsapp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.projects.footballresultsapp.model.competition.CompetitionList;
import spring.projects.footballresultsapp.services.CompetitionsService;

@RestController
@RequestMapping("/competitions")
public class CompetitionsController {

    CompetitionsService service;

    public CompetitionsController(final CompetitionsService service) {
        this.service = service;
    }

    @GetMapping
    ResponseEntity<CompetitionList> getAllCompetitions(){
        return ResponseEntity.ok(service.getAllCompetitions());
    }

}
