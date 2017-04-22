package org.am.service;

import java.sql.SQLException;

public interface UserService {

	public boolean isValidUser(String username, String password) throws SQLException;

}
