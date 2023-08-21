package spring.projects.footballresultsapp.model.match;


import spring.projects.footballresultsapp.model.competition.Competition;

import java.util.List;

public class MatchList {


//	private String count;
	private Competition competition;
	private List<Match> matches;

	public MatchList(Competition competition, List<Match> matches) {
		this.competition = competition;
		this.matches = matches;
	}
	public Competition getCompetition() {
		return competition;
	}

	public void setCompetition(Competition competition) {
		this.competition = competition;
	}

	public List<Match> getMatches() {
		return matches;
	}

	public void setMatches(List<Match> matches) {
		this.matches = matches;
	}

}
