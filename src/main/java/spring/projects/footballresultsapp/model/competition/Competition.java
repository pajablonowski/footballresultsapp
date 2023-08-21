package spring.projects.footballresultsapp.model.competition;

import spring.projects.footballresultsapp.model.area.Area;

import java.util.List;

public class Competition {
	

	private String id;
	private String name;
	private String code;
	private String lastUpdated;


	public Competition() {
	}

	public Competition(String id, String name, String code, String lastUpdated) {
		this.id = id;
		this.name = name;
		this.code = code;
		this.lastUpdated = lastUpdated;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public String getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

}
