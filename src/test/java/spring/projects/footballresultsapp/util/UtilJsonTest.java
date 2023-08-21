package spring.projects.footballresultsapp.util;

import org.junit.jupiter.api.Test;
import spring.projects.footballresultsapp.model.competition.CompetitionList;
import static org.assertj.core.api.Assertions.assertThat;


class UtilJsonTest {

    public static final String URI = "https://api.football-data.org/v2/";
    public static final String TOKEN = "7ae24f82e0cc40b99e89e2b6436050d7";

    @Test
    public void should_display_URL_doesNotAnswer_for_ncorrectToken(){
        UtilJson<CompetitionList> utilJson = new UtilJson<CompetitionList>();
        String incorrectToken = utilJson.getJsonStringByUrl(URI + "competitions/", "incorrect token");
        assertThat(incorrectToken).isEqualTo("URL does not answer.");
    }
    @Test
    public void should_display_URL_doesNotAnswer_for_ncorrectURI(){
        UtilJson<CompetitionList> utilJson = new UtilJson<CompetitionList>();
        String incorrectURI = utilJson.getJsonStringByUrl(URI + "incorrect/competitions/", TOKEN);
        assertThat(incorrectURI).isEqualTo("URL does not answer.");
    }

    @Test
    public void should_return_JSON(){
        UtilJson<CompetitionList> utilJson = new UtilJson<CompetitionList>();
        String JSON = utilJson.getJsonStringByUrl(URI + "competitions/", TOKEN);
        assertThat(JSON).isNotEqualTo("URL does not answer.");
    }

}