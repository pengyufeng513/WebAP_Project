package webadv.s16202218.demo.entity;

public class Course {
	private String CourseId;
	private String CourseName;
	private double CourseCredit;
	private String CourseClass;
	private String PrerequisiteCourses;
	private String CourseDesc;
	public Course(String CourseId, String CourseName, double CourseCredit, String CourseClass, String PrerequisiteCourses, String CourseDesc) {
		this.setCourseId(CourseId);
		this.setCourseName(CourseName);
		this.setCourseCredit(CourseCredit);
		this.setCourseClass(CourseClass);
		this.setPrerequisiteCourses(PrerequisiteCourses);
		this.setCourseDesc(CourseDesc);
	}
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
	public double getCourseCredit() {
		return CourseCredit;
	}
	public void setCourseCredit(double courseCredit) {
		CourseCredit = courseCredit;
	}
	public String getCourseClass() {
		return CourseClass;
	}
	public void setCourseClass(String courseClass) {
		CourseClass = courseClass;
	}
	public String getPrerequisiteCourses() {
		return PrerequisiteCourses;
	}
	public void setPrerequisiteCourses(String prerequisiteCourses) {
		PrerequisiteCourses = prerequisiteCourses;
	}
	public String getCourseDesc() {
		return CourseDesc;
	}
	public void setCourseDesc(String courseDesc) {
		CourseDesc = courseDesc;
	}
}
