package webadv.s16202218.demo.entity;

public class BeginCourse {
	private String TeacherId;
	private String CourseId;
	private String CourseTerm;
	private Boolean WhetherStartCourse = false;
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
	public Boolean getWhetherStartCourse() {
		return WhetherStartCourse;
	}
	public void setWhetherStartCourse(Boolean whetherStartCourse) {
		WhetherStartCourse = whetherStartCourse;
	}
}
