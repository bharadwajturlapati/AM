package org.am.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.sql.DataSource;

import org.am.dao.FlightSearchDao;

public class FlightSearchDaoImpl implements FlightSearchDao {
	DataSource dataSource;

	public DataSource getDataSource() {
		return this.dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public String getAllFlights(String date) throws SQLException{
		String weekdayOfDate = getWeekFromDate(date);
		String query = "select flightid, fightname from flights where day=?";
		PreparedStatement pstmt = dataSource.getConnection().prepareStatement(query);
		pstmt.setString(1, weekdayOfDate);
		ResultSet resultSet = pstmt.executeQuery();
		return "";
	}

	private String getWeekFromDate(String date) {
		Date dateObj = null;
		SimpleDateFormat simpleDateformat = null;
		try {
			dateObj = new SimpleDateFormat("dd/MM/yyyy").parse(date);
			simpleDateformat = new SimpleDateFormat("E");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return simpleDateformat.format(dateObj).toString();
	}

	/*public static void main(String[] args) {
		try {
			System.out.println(getWeekFromDate("23/04/2017"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

}
