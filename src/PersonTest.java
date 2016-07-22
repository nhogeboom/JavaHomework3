import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;


public class PersonTest {

	@Test
	public void testGetAge_positive() {
		Person person1 = new Person("Julia",1952);
		int actual = person1.getAge();
		assertEquals(64, actual);
	}
	
	@Test
	public void testGetAge_null() {
		Person person1 = new Person("Nicole");
		int actual = person1.getAge();
		int currentCalendarYear = Calendar.getInstance().get(Calendar.YEAR);
		assertEquals(currentCalendarYear, actual);
	}
	
	@Test
	public void testChangeName_String() {
		Person person1 = new Person("William");
		person1.changeName("Will");
		String actual = person1.getName();
		assertEquals("Will", actual);
	}
	
	@Test
	public void testChangeName_null() {
		Person person1 = new Person("Kate");
		person1.changeName(null);
		String actual = person1.getName();
		assertEquals("Unknown Person", actual);
	}
}
