
public class Homwork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("Brad Pitt",2);
		Student student2 = new Student("Catherine Zeta-Jones",5);
		Student student3 = new Student("Sean Connery",3);
		
		System.out.println("Total rating is "+Integer.toString(Student.getTotalRating()));
		System.out.println("Average rating is "+Double.toString(Student.getAvgRating()));
		
		Employee employee1 = new Employee("Matt Damon",300,12);
		Employee employee2 = new Employee("Chris Pratt",175);
		Employee employee3 = new Employee("Kate Winslet",250,4);
		
		System.out.println("Total hours worked between all 3 employees is "+Integer.toString(Employee.getTotalHours()));
		System.out.println(employee1.toString());
		
		Person person1 = new Person("Jack Black",1973);
		
		System.out.println(person1.getName()+" is " + Integer.toString(person1.getAge())+ " years old.");
	}

}
