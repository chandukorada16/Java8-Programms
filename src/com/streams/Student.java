package com.streams;

public class Student {
	
	 Integer stdId;
	
	 String stdName;
	
	 Integer stdMarks;
	
	 Integer stdAge;
	
	Double stdSalary;

	public Student(Integer stdId, String stdName, Integer stdMarks, Integer stdAge, Double stdSalary) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdMarks = stdMarks;
		this.stdAge = stdAge;
		this.stdSalary = stdSalary;
	}

	public Integer getStdId() {
		return stdId;
	}

	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public Integer getStdMarks() {
		return stdMarks;
	}

	public void setStdMarks(Integer stdMarks) {
		this.stdMarks = stdMarks;
	}

	public Integer getStdAge() {
		return stdAge;
	}

	public void setStdAge(Integer stdAge) {
		this.stdAge = stdAge;
	}

	public Double getStdSalary() {
		return stdSalary;
	}

	public void setStdSalary(Double stdSalary) {
		this.stdSalary = stdSalary;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdMarks=" + stdMarks + ", stdAge=" + stdAge
				+ ", stdSalary=" + stdSalary + "]";
	}
	
	
	
	

}
