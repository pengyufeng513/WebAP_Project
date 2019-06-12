package webadv.s16202218.demo.entity;

public class ChooseCourse {
	private String CourseId;
	private String StudentId;
	private String CourseTerm;
	public ChooseCourse(String CourseId, String StudentId, String CourseTerm) {
		this.setCourseId(CourseId);
		this.setStudentId(StudentId);
		this.setCourseTerm(CourseTerm);
	}
	public String getCourseId() {
		return CourseId;
	}
	public void setCourseId(String courseId) {
		CourseId = courseId;
	}
	public String getStudentId() {
		return StudentId;
	}
	public void setStudentId(String studentId) {
		StudentId = studentId;
	}
	public String getCourseTerm() {
		return CourseTerm;
	}
	public void setCourseTerm(String courseTerm) {
		CourseTerm = courseTerm;
	}
}
