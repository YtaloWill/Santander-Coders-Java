package stream;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Course> courses = Arrays.asList(
				new Course("Java", 10),
				new Course("Javascript", 20),
				new Course("PHP", 30)
				);
		
//		int sumStudents = 0;
//		for (Course course : courses) {
//			sumStudents += course.getAmountStudents();
//		}
//		System.out.println(sumStudents);
		
		System.out.println(courses.stream().mapToInt(Course::getAmountStudents).sum());
	}
}
