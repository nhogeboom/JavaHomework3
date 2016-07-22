import static org.junit.Assert.*;

import org.junit.Test;


public class StudentTest {

	/*private SchoolService schoolService = new SchoolService();

	@Test
	public void testGetAvgRating_positive() {
		School school = new School();
		Student student1 = new Student("John",2);
		Student student2 = new Student("Sally",13);
		school.addStudent(student1);
		school.addStudent(student2);

		double actual = schoolService.calculateAverageStudentRating(school);
		assertEquals(7.5, actual ,0.0);
	}
	
	@Test
	public void testGetAvgRating_negative() {
		School school = new School();
		Student student1 = new Student("John",-2);
		Student student2 = new Student("Sally",1);
		school.addStudent(student1);
		school.addStudent(student2);
		double actual = schoolService.calculateAverageStudentRating(school);

		assertEquals(-0.5, actual, 0.0);
	}*/
	
	
	@Test
	public void testGetAvgRating_positive() {
		Student.reset();
		Student student1 = new Student("John",2);
		Student student2 = new Student("Sally",13);

		double actual = Student.getAvgRating();
		assertEquals(7.5, actual ,0.0);
	}
	
	@Test
	public void testGetAvgRating_negative() {
		Student.reset();
		Student student1 = new Student("John",-2);
		Student student2 = new Student("Sally",1);
		
		double actual = Student.getAvgRating();
		assertEquals(-0.5, actual, 0.0);
	}
	
	@Test
	public void testGetAvgRating_null() {
		Student.reset();
		Student student1 = new Student("John");
		Student student2 = new Student("Sally",1);
		
		double actual = Student.getAvgRating();
		assertEquals(1.0, actual, 0.0);
	}
	
	@Test
	public void testGetAvgRating_ratingChanged() {
		Student.reset();
		Student student1 = new Student("John",42);
		Student student2 = new Student("Sally",21);
		
		student1.changeRating(24);
		double actual = Student.getAvgRating();
		assertEquals(22.5, actual, 0.0);
	}

}
