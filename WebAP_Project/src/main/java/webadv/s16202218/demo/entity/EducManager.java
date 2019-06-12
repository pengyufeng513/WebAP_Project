package webadv.s16202218.demo.entity;

public class EducManager {
	private String AdminId;
	private String AdminPassword;
	private String AdminName;
	private String AdminSex;
	private String AdminBorn;
	public EducManager(String AdminId, String AdminPassword, String AdminName, String AdminSex, String AdminBorn) {
		super();
		this.AdminId = AdminId;
		this.AdminPassword = AdminPassword;
		this.AdminName = AdminName;
		this.AdminSex = AdminSex;
		this.AdminBorn = AdminBorn;
	}
	public String getAdminId() {
		return AdminId;
	}
	public void setAdminId(String adminId) {
		AdminId = adminId;
	}
	public String getAdminPassword() {
		return AdminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		AdminPassword = adminPassword;
	}
	public String getAdminName() {
		return AdminName;
	}
	public void setAdminName(String adminName) {
		AdminName = adminName;
	}
	public String getAdminSex() {
		return AdminSex;
	}
	public void setAdminSex(String adminSex) {
		AdminSex = adminSex;
	}
	public String getAdminBorn() {
		return AdminBorn;
	}
	public void setAdminBorn(String adminBorn) {
		AdminBorn = adminBorn;
	}
}
