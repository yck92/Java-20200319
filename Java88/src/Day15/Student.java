package Day15;

public class Student { // java bean이라고 한다
	private String name; // 이름
	private String gender; // 성별
	private int age; // 나이
	private int sNo; // 학번

	public Student(String name, String gender, int age, int sNo) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.sNo = sNo;
	}

	public Student() {
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		if (gender.equals("여성")) {
			sNo += 2000;

		} else {
			sNo += 1000;
		}
		this.sNo = sNo;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	public void showInfo() {
		System.out.println("성명:" + name);
		System.out.println("성별:" + gender);
		System.out.println("나이:" + age);
		System.out.println("학번:" + sNo);
	}
}
