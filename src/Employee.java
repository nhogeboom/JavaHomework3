
public class Employee {

		private String name;
		private int rate;
		private int hours;
		
		private static int totalHours=0;
		
		public Employee(){};
		
		public Employee(String name, int rate) {
			this.name = name;
			this.rate = rate;
		}
		
		public Employee(String name, int rate, int hours) {
			this.name = name;
			this.rate = rate;
			this.hours = hours;
			totalHours += hours;
		}
		
		public String getName(){
			return this.name;
		}
		
		public int getRate(){
			return this.rate;
		}
		
		public int getHours(){
			return this.hours;
		}
		
		public void setName(String name){
			if (name == null || name.trim().length() == 0) {
				name = "Unknown Employee";
			}
			this.name = name;
		}
		
		public void setRate(int rate){
			this.rate = rate;
		}
		
		public void setHours(int hours){
			this.hours = hours;
		}
		
		public double getSalary() {
			return rate*hours;
		}
		
		public String toString() {
			return "Employee "+this.name+" has worked "+Integer.toString(this.hours)+" at a rate of "+Integer.toString(this.rate)+" for a total salary of "+Double.toString(getSalary());
		}
		
		public void changeRate(int rate) {
			setRate(rate);
		}
		
		public double getBonus() {
			return Math.round((getSalary()*.1)*100.0)/100.0;
		}
		
		public static int getTotalHours(){
			return totalHours;
		}
}
