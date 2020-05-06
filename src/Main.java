import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author Henry.Ouyang
 * @since 2020/05/03
 * @version 1.0 (2020/05/06)
 */

public class Main {
	
	Scanner in = new Scanner(System.in);
	
	/**
	 * Main Application
	 * @param args
	 */
	public static void main(String[] args) {
		TimeInstant begin1 = new TimeInstant(8, 30, 0);
		TimeInstant end1 = new TimeInstant(9, 30, 0);
		
		TimeInterval interval1 = new TimeInterval(begin1, end1);
		
		//System.out.println(interval1.toString());
		
		Schedule sche1_1 = new Schedule("Lecture", "101", "MWF", interval1);
		Schedule sche1_2 = new Schedule("Tutorial", "L1N", "M", interval1);
		ArrayList<Schedule> scheList1 = new ArrayList<Schedule>();
		
		Course course1 = new Course("CPSC101");
		course1.getscheduleList().add(sche1_1);
		

		Course.printCourse(course1);
	}

}
