package spring.projects.footballresultsapp.model.standing;

import spring.projects.footballresultsapp.model.competition.Competition;
import spring.projects.footballresultsapp.model.competition.CompetitionSeason;

import java.util.List;

public class Standing {

	private Competition competition;
	private CompetitionSeason season;
	private List<StandingType> standings;

	public Standing(Competition competition, CompetitionSeason season,
			List<StandingType> standings) {
		this.competition = competition;
		this.season = season;
		this.standings = standings;
	}

	public Competition getCompetition() {
		return competition;
	}

	public void setCompetition(Competition competition) {
		this.competition = competition;
	}

	public CompetitionSeason getSeason() {
		return season;
	}

	public void setSeason(CompetitionSeason season) {
		this.season = season;
	}

	public List<StandingType> getStandings() {
		return standings;
	}

	public void setStandings(List<StandingType> standings) {
		this.standings = standings;
	}

}
