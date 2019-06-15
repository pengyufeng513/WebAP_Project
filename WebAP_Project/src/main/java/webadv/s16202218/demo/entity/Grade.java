package webadv.s16202218.demo.entity;

public class Grade {
	private String GradeId;
	private String CourseTerm;
	private String CourseId;
	private String CourseName;
	private int CourseGrades;
	private int CourseGrade;
	private int CourseStudyTime;
	private String CourseType;
	public Grade(String GradeId, String CourseTerm, String CourseId, String CourseName, int CourseGrades, int CourseGrade, int CourseStudyTime, String CourseType) {
		super();
		this.GradeId = GradeId;
		this.CourseTerm = CourseTerm;
		this.CourseId = CourseId;
		this.CourseName = CourseName;
		this.CourseGrades = CourseGrades;
		this.CourseGrade = CourseGrade;
		this.CourseStudyTime = CourseStudyTime;
		this.CourseType = CourseType;
	}
	public String getGradeId() {
		return GradeId;
	}
	public void setGradeId(String gradeId) {
		GradeId = gradeId;
	}
	public String getCourseTerm() {
		return CourseTerm;
	}
	public void setCourseTerm(String courseTerm) {
		CourseTerm = courseTerm;
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
	public int getCourseGrades() {
		return CourseGrades;
	}
	public void setCourseGrades(int courseGrades) {
		CourseGrades = courseGrades;
	}
	public int getCourseGrade() {
		return CourseGrade;
	}
	public void setCourseGrade(int courseGrade) {
		CourseGrade = courseGrade;
	}
	public int getCourseStudyTime() {
		return CourseStudyTime;
	}
	public void setCourseStudyTime(int courseStudyTime) {
		CourseStudyTime = courseStudyTime;
	}
	public String getCourseType() {
		return CourseType;
	}
	public void setCourseType(String courseType) {
		CourseType = courseType;
	}
}
