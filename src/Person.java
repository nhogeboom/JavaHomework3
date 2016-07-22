import java.util.Calendar;


public class Person {
	private String name;
	private int birthdayYear;
	
	public Person(){}
	
	public Person(String name){
		if (name == null || name.trim().length() == 0) {
			name = "Unknown Person";
		}
		this.name = name;
	}
	
	public Person(String name, int birthdayYear){
		this.name = name;
		this.birthdayYear = birthdayYear;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getBirthdayYear() {
		return this.birthdayYear;
	}
	
	public void setName(String name) {
		if (name == null || name.trim().length() == 0) {
			name = "Unknown Person";
		}
		this.name = name;
	}
	
	public void setBirthdayYear(int birthdayYear) {
		this.birthdayYear = birthdayYear;
	}
	
	public int getAge() {
		return Calendar.getInstance().get(Calendar.YEAR) - this.birthdayYear;
	}
	
	public void changeName(String name) {
		setName(name);
	}
}
