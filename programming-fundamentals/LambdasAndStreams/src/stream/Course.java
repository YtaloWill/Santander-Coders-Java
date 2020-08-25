package stream;

public class Course {
	private String category;
	private int amountStudents;
	
	public Course(String category, int amountStudents) {
		this.category = category;
		this.amountStudents = amountStudents;
	}

	public String getCategory() {
		return category;
	}

	public int getAmountStudents() {
		return amountStudents;
	}
	
}
