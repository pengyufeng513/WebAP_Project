package webadv.s16202218.demo.entity;

public class Course {
	private String CourseId;
	private String CourseName;
	private int CourseCredit;
	private String PrerequisiteCourses;
	private String Period;
	public String getCourseId() {
		return CourseId;
	}
	public void setCourseId(String courseId) {
		CourseId = courseId;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public int getCourseCredit() {
		return CourseCredit;
	}
	public void setCourseCredit(int courseCredit) {
		CourseCredit = courseCredit;
	}
	public String getPrerequisiteCourses() {
		return PrerequisiteCourses;
	}
	public void setPrerequisiteCourses(String prerequisiteCourses) {
		PrerequisiteCourses = prerequisiteCourses;
	}
	public String getPeriod() {
		return Period;
	}
	public void setPeriod(String period) {
		Period = period;
	}

}
