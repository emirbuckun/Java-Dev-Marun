package hw1;

public class Person {
	private String name;
	private String birthDate;
	private String birthPlace;

	public Person(String name, int birthDate, String birthPlace) {
		this.name = name;
		this.birthDate = "" + birthDate;
		this.birthPlace = birthPlace;
	}

	public Person(String name, int birthDate) {
		this.name = name;
		this.birthDate = "" + birthDate;
	}

	public Person(String name) {
		this.name = name;
	}

	public String toString() {
		return getName() + ", Birth Date: " + getBirthDate() +
				", Birth Place: " + getBirthPlace();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

}
