import java.util.ArrayList;
import java.util.List;


public class School {

	private List<Student> students = new ArrayList<Student>();

	public List<Student> getStudents() {
		return students;
	}

	public void addStudent(Student student) {
		students.add(student);
	}

}

