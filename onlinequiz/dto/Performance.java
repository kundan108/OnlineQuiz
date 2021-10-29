package onlinequiz.dto;

public class Performance {
	private String user_id;
	private String exam_id;
	private int right;
	private int wrong;
	private int unattemp;
	private String language;
	
	public Performance() {
		super();
	}
	
	public Performance(String user_id, String exam_id, int right, int wrong, int unattemp, String language) {
		super();
		this.user_id = user_id;
		this.exam_id = exam_id;
		this.right = right;
		this.wrong = wrong;
		this.unattemp = unattemp;
		this.language = language;
	}

	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getExam_id() {
		return exam_id;
	}
	public void setExam_id(String exam_id) {
		this.exam_id = exam_id;
	}
	public int getRight() {
		return right;
	}
	public void setRight(int right) {
		this.right = right;
	}
	public int getWrong() {
		return wrong;
	}
	public void setWrong(int wrong) {
		this.wrong = wrong;
	}
	public int getUnattemp() {
		return unattemp;
	}
	public void setUnattemp(int unattemp) {
		this.unattemp = unattemp;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
}
