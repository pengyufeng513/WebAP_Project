package webadv.sample.demo.entity;

public class BeginCourse {
	private String TeacherId;
	private String CourseId;
	private String CourseTerm;
	private String CourseWhether;
	public BeginCourse(String TeacherId, String CourseId, String CourseTerm) {
		super();
		this.TeacherId = TeacherId;
		this.CourseId = CourseId;
		this.CourseTerm = CourseTerm;
	}
	public String getTeacherId() {
		return TeacherId;
	}
	public void setTeacherId(String teacherId) {
		TeacherId = teacherId;
	}
	public String getCourseId() {
		return CourseId;
	}
	public void setCourseId(String courseId) {
		CourseId = courseId;
	}
	public String getCourseTerm() {
		return CourseTerm;
	}
	public void setCourseTerm(String courseTerm) {
		CourseTerm = courseTerm;
	}
	public String getCourseWhether() {
		return CourseWhether;
	}
	public void setCourseWhether(String courseWhether) {
		CourseWhether = courseWhether;
	}
}
