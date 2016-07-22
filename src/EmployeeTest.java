import static org.junit.Assert.*;

import org.junit.Test;


public class EmployeeTest {

	@Test
	public void testGetSalary_positive() {
		Student.reset();// need to reset as the static variable continues through all unit tests
		Employee employee1 = new Employee("John",24,40);

		double actual = employee1.getSalary();
		assertEquals(960.0, actual ,0.0);
	}
	
	@Test
	public void testGetSalary_negative() {
		Student.reset();
		Employee employee1 = new Employee("Sally",12,-1);

		double actual = employee1.getSalary();
		assertEquals(-12.0, actual ,0.0);
	}
	
	@Test
	public void testGetSalary_rateChanged() {
		Student.reset();
		Employee employee1 = new Employee("Tom",10,25);
		employee1.changeRate(5);
		double actual = employee1.getSalary();
		assertEquals(125.0, actual ,0.0);
	}
	
	@Test
	public void testGetBonus_positive() {
		Student.reset();
		Employee employee1 = new Employee("Harry",5,15);
		double actual = employee1.getBonus();
		assertEquals(7.5, actual ,0.0);
	}
}
