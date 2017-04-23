package org.am.dao;

import java.sql.SQLException;

public interface FlightSearchDao {
	public String getAllFlights(String date) throws SQLException;
}
