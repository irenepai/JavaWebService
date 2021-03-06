package cn.sm1234.domain;

public class User {

	private Integer id;
	private String name;
	private String gender;

    public User() {
		
	}

	public User(Integer id, String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}
	
}
