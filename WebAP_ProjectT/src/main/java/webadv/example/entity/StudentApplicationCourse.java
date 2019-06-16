package webadv.example.entity;

public class StudentApplicationCourse {
      public int getCourseId() {
		return CourseId;
	}
	public void setCourseId(int courseId) {
		CourseId = courseId;
	}
	private int CourseId;
       private String courseName; 
       private String courseTeacher;
       private String courseTime;
       private String coursePlace;
       private int courseCredit;
       public int getCourseCredit() {
		return courseCredit;
	}
	public void setCourseCredit(int courseCredit) {
		this.courseCredit = courseCredit;
	}
	
       public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseTeacher() {
		return courseTeacher;
	}
	public void setCourseTeacher(String courseTeacher) {
		this.courseTeacher = courseTeacher;
	}
	public String getCourseTime() {
		return courseTime;
	}
	public void setCourseTime(String courseTime) {
		this.courseTime = courseTime;
	}
	public String getCoursePlace() {
		return coursePlace;
	}
	public void setCoursePlace(String coursePlace) {
		this.coursePlace = coursePlace;
	}
}
