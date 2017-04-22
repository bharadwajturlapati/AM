package org.am.viewbean;

public class FlightCrewBean {
	private String[] pilot;
	private String[] cabinCrew;
	private String[] groundCrew;

	public String[] getPilot() {
		return pilot;
	}

	public void setPilot(String[] pilot) {
		this.pilot = pilot;
	}

	public String[] getCabinCrew() {
		return cabinCrew;
	}

	public void setCabinCrew(String[] cabinCrew) {
		this.cabinCrew = cabinCrew;
	}

	public String[] getGroundCrew() {
		return groundCrew;
	}

	public void setGroundCrew(String[] groundCrew) {
		this.groundCrew = groundCrew;
	}
}
