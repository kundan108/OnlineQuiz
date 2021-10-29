package onlinequiz.dto;

public class UserDetails {
	private String user_id;
	private String user_name;
	private String user_type;
	private String email_id;
	private String mobile;
	private String dob;
	private String gender;
	private String password;
	
	public UserDetails() {
		super();
	}
	
	public UserDetails(String user_id, String user_name, String user_type, String email_id, String mobile, String dob,
			String gender, String password) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_type = user_type;
		this.email_id = email_id;
		this.mobile = mobile;
		this.dob = dob;
		this.gender = gender;
		this.password = password;
	}

	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	
}
