package webadv.sample.demo.entity;

public class TeachCourse {
	private String TeacherId;
	private String CourseId;
	private String CourseTerm;
	private String BeginTime;
	private String BeginAddress;
	public TeachCourse(String TeacherId, String CourseId, String CourseTerm) {
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
	public String getBeginTime() {
		return BeginTime;
	}
	public void setBeginTime(String beginTime) {
		BeginTime = beginTime;
	}
	public String getBeginAddress() {
		return BeginAddress;
	}
	public void setBeginAddress(String beginAddress) {
		BeginAddress = beginAddress;
	}
}
