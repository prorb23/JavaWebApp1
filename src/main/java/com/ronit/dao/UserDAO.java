package com.ronit.dao;
import com.ronit.model.User;
import com.ronit.util.DButil;
import java.sql.*;
public class UserDAO {

	public boolean registerUser(User user) {
	    String sql = "INSERT INTO users(name, email, password) VALUES (?, ?, ?)";

	    try (Connection conn = DButil.getConnection();
	         PreparedStatement ps = conn.prepareStatement(sql)) {

	        ps.setString(1, user.getName());
	        ps.setString(2, user.getEmail());
	        ps.setString(3, user.getPassword());

	        int rowsInserted = ps.executeUpdate();
	        return rowsInserted > 0;

	    } catch (SQLException e) {
	        e.printStackTrace();
	        return false;
	    }
	}


	public boolean validateUser(String email, String password) {
	    String sql = "SELECT * FROM users WHERE email = ? AND password = ?";

	    try (Connection conn = DButil.getConnection();
	         PreparedStatement ps = conn.prepareStatement(sql)) {

	        ps.setString(1, email);
	        ps.setString(2, password);

	        ResultSet rs = ps.executeQuery();
	        return rs.next(); // returns true if user exists

	    } catch (SQLException e) {
	        e.printStackTrace();
	        return false;
	    }
	}

}


