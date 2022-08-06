package abs;

public abstract class Person {

	private String name;
	private String gender;
	private String birthday;
	private boolean isMarried;

	public Person(String n, String g, String b, boolean i) {
		name = n;
		gender = g;
		birthday = b;
		isMarried = i;
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

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public boolean isMarried() {
		return isMarried;
	}

	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}

	public abstract void printInfo();

}
