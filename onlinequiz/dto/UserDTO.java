package onlinequiz.dto;

public class UserDTO {
	private String userid;
	private String passowrd;
	private String user_type;
	
	public UserDTO() {
		super();
	}
	
	public UserDTO(String userid, String passowrd, String user_type) {
		super();
		this.userid = userid;
		this.passowrd = passowrd;
		this.user_type = user_type;
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassowrd() {
		return passowrd;
	}
	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	
}
