package kr.ac.hansung.dao;

public class Course {
	
	private int year;
	private int term;
	private String code;
	private String subject;
	private String division;
	private int grade;
	
	  
	public Course() {
		
	}
	
	public Course(int year, int term, String code, String subject, String division, int grade) {
		
		this.year = year;
		this.term = term;
		this.code = code;
		this.subject = subject;
		this.division = division;
		this.grade = grade;
	}

	
	
	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String toString() {
		return "Course [year=" + year + ", term=" + term + ", code=" + code + ", subject=" + subject + ", division="
				+ division + ", grade=" + grade + "]";
	}
	
}
