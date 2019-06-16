package webadv.example.entity;

public class StudentGrade {
private int gradeId;
private String courseTerm;
public String getCourseTerm() {
	return courseTerm;
}
public void setCourseTerm(String courseTerm) {
	this.courseTerm = courseTerm;
}
private int courseId;
private String courseName;
private int courseGrades;
private int courseGrade;
private int courseStudyTime;
private String courseType;
public int getGradeId() {
	return gradeId;
}
public void setGradeId(int gradeId) {
	this.gradeId = gradeId;
}

public int getCourseId() {
	return courseId;
}
public void setCourseId(int courseId) {
	this.courseId = courseId;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public int getCourseGrades() {
	return courseGrades;
}
public void setCourseGrades(int courseGrades) {
	this.courseGrades = courseGrades;
}
public int getCourseGrade() {
	return courseGrade;
}
public void setCourseGrade(int courseGrade) {
	this.courseGrade = courseGrade;
}
public int getCourseStudyTime() {
	return courseStudyTime;
}
public void setCourseStudyTime(int courseStudyTime) {
	this.courseStudyTime = courseStudyTime;
}
public String getCourseType() {
	return courseType;
}
public void setCourseType(String courseType) {
	this.courseType = courseType;
}
}
