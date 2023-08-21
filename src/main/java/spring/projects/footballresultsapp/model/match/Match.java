package spring.projects.footballresultsapp.model.match;

import spring.projects.footballresultsapp.model.competition.Competition;
import spring.projects.footballresultsapp.model.competition.CompetitionSeason;
import spring.projects.footballresultsapp.model.team.Team;

import java.util.List;

public class Match {

	private String id;
	private Competition competition;
	private CompetitionSeason season;
	private String utcDate;
	private String status;
	private String venue;
	private String matchday;
	private String stage;
	private String group;
	private String lastUpdated;
	private Team homeTeam;
	private Team awayTeam;
	private MatchScore score;
	private List<MatchReferees> referees;

	public Match(String id, Competition competition, CompetitionSeason season, String utcDate,
			String status, String venue, String matchday, String stage, String group, String lastUpdated,
			Team homeTeam, Team awayTeam, MatchScore score, List<MatchReferees> referees) {
		this.id = id;
		this.competition = competition;
		this.season = season;
		this.utcDate = utcDate;
		this.status = status;
		this.venue = venue;
		this.matchday = matchday;
		this.stage = stage;
		this.group = group;
		this.lastUpdated = lastUpdated;
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
		this.score = score;
		this.referees = referees;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getUtcDate() {
		return utcDate;
	}
	public void setUtcDate(String utcDate) {
		this.utcDate = utcDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getMatchday() {
		return matchday;
	}
	public void setMatchday(String matchday) {
		this.matchday = matchday;
	}
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	public Team getHomeTeam() {
		return homeTeam;
	}
	public void setHomeTeam(Team homeTeam) {
		this.homeTeam = homeTeam;
	}
	public Team getAwayTeam() {
		return awayTeam;
	}
	public void setAwayTeam(Team awayTeam) {
		this.awayTeam = awayTeam;
	}
	public MatchScore getScore() {
		return score;
	}
	public void setScore(MatchScore score) {
		this.score = score;
	}
	public List<MatchReferees> getReferees() {
		return referees;
	}
	public void setReferees(List<MatchReferees> referees) {
		this.referees = referees;
	}

}
