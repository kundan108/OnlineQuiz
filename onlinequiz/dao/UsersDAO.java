package onlinequiz.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import onlinequiz.dbutil.DBConnection;
import onlinequiz.dto.UserDTO;
import onlinequiz.dto.UserDetails;

public class UsersDAO {
	private static PreparedStatement ps,ps1,ps2;
	static {
		try {
			ps=DBConnection.getConnection().prepareStatement("select user_name from users where userid=? and password=? and user_type=?");
			ps1=DBConnection.getConnection().prepareStatement("select * from users where user_type=?");
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	public static String validateUser(UserDTO user) throws SQLException{
		ps.setString(1, user.getUserid());
		ps.setString(2, user.getPassowrd());
		ps.setString(3, user.getUser_type());
		ResultSet rs= ps.executeQuery();
		if(rs.next()) {
			return rs.getString(1);
		}
		return null;
	}
	public static ArrayList<UserDetails> getAllStudent() throws SQLException{
		ps1.setString(1, "student");
		ResultSet rs=ps1.executeQuery();
		ArrayList<UserDetails> userList = new ArrayList<>();
		while(rs.next()) {
			UserDetails userDetails = new UserDetails();
			userDetails.setUser_id(rs.getString(1));
			userDetails.setUser_name(rs.getString(2));
			userDetails.setEmail_id(rs.getString(3));
			userDetails.setMobile(rs.getString(4));
			userDetails.setDob(rs.getDate(5).toString());
			userDetails.setGender(rs.getString(6));
			userDetails.setPassword(rs.getString(7));
			userDetails.setUser_type(rs.getString(8));
			userList.add(userDetails);
		}
		return userList;
	}
	public static ArrayList<UserDetails> getAllTeacher() throws SQLException{
		ps1.setString(1, "teacher");
		ResultSet rs=ps1.executeQuery();
		ArrayList<UserDetails> userList = new ArrayList<>();
		while(rs.next()) {
			UserDetails userDetails = new UserDetails();
			userDetails.setUser_id(rs.getString(1));
			userDetails.setUser_name(rs.getString(2));
			userDetails.setEmail_id(rs.getString(3));
			userDetails.setMobile(rs.getString(4));
			userDetails.setDob(rs.getDate(5).toString());
			userDetails.setGender(rs.getString(6));
			userDetails.setPassword(rs.getString(7));
			userDetails.setUser_type(rs.getString(8));
			userList.add(userDetails);
		}
		return userList;
	}
}
