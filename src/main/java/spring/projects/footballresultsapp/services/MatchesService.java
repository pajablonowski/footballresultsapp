package spring.projects.footballresultsapp.services;

import org.springframework.stereotype.Service;
import spring.projects.footballresultsapp.AppConfigurationProperties;
import spring.projects.footballresultsapp.model.match.MatchList;
import spring.projects.footballresultsapp.util.UtilJson;

@Service
public class MatchesService {

    AppConfigurationProperties config;

    public MatchesService(AppConfigurationProperties config) {
        this.config = config;
    }

    public MatchList getAllTodaysMatches() {
        UtilJson<MatchList> utilJson = new UtilJson<MatchList>();
        return utilJson.getObjectFromJson(config.getURI() + "matches/", MatchList.class, config.getTOKEN());
    }

    public MatchList getAllPremierLeagueMatches(int matchday) {
        UtilJson<MatchList> utilJson = new UtilJson<MatchList>();
        return utilJson.getObjectFromJson(config.getURI() + "competitions/PL/matches?matchday="+matchday, MatchList.class, config.getTOKEN());
    }


}
