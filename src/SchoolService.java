import java.util.List;


public class SchoolService {

	public double calculateAverageStudentRating(School school) {
		List<Student> students = school.getStudents();
		int count = students.size();
		double totalRating = 0.0;
		for (Student student : students) {
			totalRating += student.getRating();
		}
		
		return totalRating/count;
	}
}
