package org.am.viewbean;

import java.util.List;

import org.am.constants.FlightType;

public class FlightBean extends UserBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<PassengerBean> passengerBean;
	private String flightId;
	private FlightType flightType;

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public FlightType getFlightType() {
		return flightType;
	}

	public void setFlightType(FlightType flightType) {
		this.flightType = flightType;
	}

	public FlightCrewBean getFlightCrewBean() {
		return flightCrewBean;
	}

	public void setFlightCrewBean(FlightCrewBean flightCrewBean) {
		this.flightCrewBean = flightCrewBean;
	}

	private FlightCrewBean flightCrewBean;

	public List<PassengerBean> getUserBean() {
		return passengerBean;
	}

	public void setUserBean(List<PassengerBean> passengerBean) {
		this.passengerBean = passengerBean;
	}

}
