package onlinequiz.dto;

public class Exam {
	private String exam_id;
	private String language;
	private int total_ques;
	
	public Exam() {
		super();
	}
	
	public Exam(String exam_id, String language, int total_ques) {
		super();
		this.exam_id = exam_id;
		this.language = language;
		this.total_ques = total_ques;
	}

	public String getExam_id() {
		return exam_id;
	}
	public void setExam_id(String exam_id) {
		this.exam_id = exam_id;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getTotal_ques() {
		return total_ques;
	}
	public void setTotal_ques(int total_ques) {
		this.total_ques = total_ques;
	}
	
}
