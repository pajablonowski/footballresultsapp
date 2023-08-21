package spring.projects.footballresultsapp.model.standing;


import spring.projects.footballresultsapp.model.team.Team;

public class StandingTeam {

	private String StandingTeamModel;
	private Team team;
	private String playedGames;
	private String won;
	private String draw;
	private String lost;
	private String points;
	private String goalsFor;
	private String goalsAgainst;
	private String goalDifference;

	public StandingTeam(String standingTeamModel, Team team, String playedGames, String won, String draw,
			String lost, String points, String goalsFor, String goalsAgainst, String goalDifference) {
		this.StandingTeamModel = standingTeamModel;
		this.team = team;
		this.playedGames = playedGames;
		this.won = won;
		this.draw = draw;
		this.lost = lost;
		this.points = points;
		this.goalsFor = goalsFor;
		this.goalsAgainst = goalsAgainst;
		this.goalDifference = goalDifference;
	}

	public String getStandingTeamModel() {
		return StandingTeamModel;
	}

	public void setStandingTeamModel(String standingTeamModel) {
		StandingTeamModel = standingTeamModel;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public String getPlayedGames() {
		return playedGames;
	}

	public void setPlayedGames(String playedGames) {
		this.playedGames = playedGames;
	}

	public String getWon() {
		return won;
	}

	public void setWon(String won) {
		this.won = won;
	}

	public String getDraw() {
		return draw;
	}

	public void setDraw(String draw) {
		this.draw = draw;
	}

	public String getLost() {
		return lost;
	}

	public void setLost(String lost) {
		this.lost = lost;
	}

	public String getPoints() {
		return points;
	}

	public void setPoints(String points) {
		this.points = points;
	}

	public String getGoalsFor() {
		return goalsFor;
	}

	public void setGoalsFor(String goalsFor) {
		this.goalsFor = goalsFor;
	}

	public String getGoalsAgainst() {
		return goalsAgainst;
	}

	public void setGoalsAgainst(String goalsAgainst) {
		this.goalsAgainst = goalsAgainst;
	}

	public String getGoalDifference() {
		return goalDifference;
	}

	public void setGoalDifference(String goalDifference) {
		this.goalDifference = goalDifference;
	}
}
