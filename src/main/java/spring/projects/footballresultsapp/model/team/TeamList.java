package spring.projects.footballresultsapp.model.team;

import spring.projects.footballresultsapp.model.competition.Competition;
import spring.projects.footballresultsapp.model.competition.CompetitionSeason;

import java.util.List;

public class TeamList {

	private String count;
	private Competition competition;
	private CompetitionSeason season;
	private List<Team> teams;

	public TeamList() {
	}
	
	public TeamList(String count, Competition competition, CompetitionSeason season,
			List<Team> teams) {
		this.count = count;
		this.competition = competition;
		this.season = season;
		this.teams = teams;
	}
	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
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

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

}
