package spring.projects.footballresultsapp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.projects.footballresultsapp.model.match.MatchList;
import spring.projects.footballresultsapp.services.MatchesService;

@RestController
@RequestMapping("/matches")
public class MatchesController {

    MatchesService service;

    public MatchesController(final MatchesService service) {
        this.service = service;
    }

    @GetMapping("/today")
    ResponseEntity<MatchList> getAllTodaysMatches(){
        return ResponseEntity.ok(service.getAllTodaysMatches());
    }
    @GetMapping("/premierLeague/{id}")
    ResponseEntity<MatchList> getAllPremierLeagueMatches(@PathVariable int id){
        return ResponseEntity.ok(service.getAllPremierLeagueMatches(id));
    }
}
