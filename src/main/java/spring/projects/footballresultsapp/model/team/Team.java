package spring.projects.footballresultsapp.model.team;

import spring.projects.footballresultsapp.model.area.Area;
import spring.projects.footballresultsapp.model.competition.Competition;
import spring.projects.footballresultsapp.model.player.Player;

import java.util.List;

public class Team {

	private String id;
	private Area area;
	private List<Competition> activeCompetitions;
	private String name;
	private String shortName;
	private String tla;
	private String address;
	private String phone;
	private String website;
	private String email;
	private String founded;
	private String clubColors;
	private String venue;
	private List<Player> squad;
	private String lastUpdated;

	public Team() {
	}

	public Team(String id, Area area, List<Competition> activeCompetitions, String name,
			String shortName, String tla, String address, String phone, String website, String email, String founded,
			String clubColors, String venue, List<Player> squad, String lastUpdated) {
		this.id = id;
		this.area = area;
		this.activeCompetitions = activeCompetitions;
		this.name = name;
		this.shortName = shortName;
		this.tla = tla;
		this.address = address;
		this.phone = phone;
		this.website = website;
		this.email = email;
		this.founded = founded;
		this.clubColors = clubColors;
		this.venue = venue;
		this.squad = squad;
		this.lastUpdated = lastUpdated;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getTla() {
		return tla;
	}

	public void setTla(String tla) {
		this.tla = tla;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFounded() {
		return founded;
	}

	public void setFounded(String founded) {
		this.founded = founded;
	}

	public String getClubColors() {
		return clubColors;
	}

	public void setClubColors(String clubColors) {
		this.clubColors = clubColors;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public List<Competition> getActiveCompetitions() {
		return activeCompetitions;
	}

	public void setActiveCompetitions(List<Competition> activeCompetitions) {
		this.activeCompetitions = activeCompetitions;
	}

	public List<Player> getSquad() {
		return squad;
	}

	public void setSquad(List<Player> squad) {
		this.squad = squad;
	}

}
