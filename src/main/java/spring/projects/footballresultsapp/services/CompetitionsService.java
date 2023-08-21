package spring.projects.footballresultsapp.services;

import org.springframework.stereotype.Service;
import spring.projects.footballresultsapp.AppConfigurationProperties;
import spring.projects.footballresultsapp.model.competition.CompetitionList;
import spring.projects.footballresultsapp.util.UtilJson;

@Service
public class CompetitionsService {

    AppConfigurationProperties config;

    public CompetitionsService(AppConfigurationProperties config) {
        this.config = config;
    }

    public CompetitionList getAllCompetitions() {
        UtilJson<CompetitionList> utilJson = new UtilJson<CompetitionList>();
        return utilJson.getObjectFromJson(config.getURI() + "competitions/", CompetitionList.class, config.getTOKEN());
    }



}
