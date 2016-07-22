
public class Student {

		private String name;
		private int rating;
		private static int studentCount = 0;
		private static int totalRating = 0;
		private static double avgRating = 0.0;
		
		public Student() {
		}
		
		public Student(String name) {
			if (name == null || name.trim().length() == 0) {
				//throw new RuntimeException("Name cannot be empty");
				name = "Unknown Student";
			}
			this.name = name;
		}
		
		public Student(String name, int rating) {
			this.name = name;
			this.rating = rating;
			studentCount++;
			totalRating += rating;
			calculateAverage();
		}
		
		public static void reset() {
			studentCount = 0;
			totalRating = 0;
			avgRating = 0.0;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void setRating(int rating) {
			this.rating = rating;
		}
		
		public String getName() {
			return this.name;
		}
		
		public int getRating() {
			return this.rating;
		}
		
		public static int getTotalRating() {
			return totalRating;
		}
		
		public static double getAvgRating() {
			return avgRating;
		}
		
		public boolean betterStudent(Student student) {
			if (this.rating > student.getRating()) {
				return true;
			}
			return false;
		}
		
		public String toString() {
			//return Student.toString();
			return "Student "+this.name+" has rating "+Integer.toString(this.rating) + ", while the average is"+ Double.toString(avgRating);
		}
		
		public void changeRating(int rating) {
			int currentRating = this.rating;
			setRating(rating);
			totalRating = totalRating-currentRating+rating;
			calculateAverage();
		}
		
		private void calculateAverage() {
			avgRating =Math.round((totalRating/(double)studentCount)*100.0)/100.0;
		}
}
