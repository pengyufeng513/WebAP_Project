package webadv.sample.demo.entity;

public class ChooseCourse {
	private String CourseId;
	private String StudentId;
	public ChooseCourse(String CourseId, String StudentId) {
		this.setCourseId(CourseId);
		this.setStudentId(StudentId);
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
}
