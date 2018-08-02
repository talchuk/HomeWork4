package At_25.Work4;


public class Member {

	private int id;
	private String surname;
	private String name;
	private int age;
	private String gender;
	
	public Member(int id, String surname,String name,int age, String gender) {
		super();
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.age =age;
		this.gender = gender;
		
	}

	public int getId() {
		return id;
	}
	public String getSurname() {
		return surname;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", surname=" + surname + ", name=" + name + ", age=" + age + ", gender =" + gender
				+ "]";
	}
	
}


