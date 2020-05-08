import java.util.Scanner;

/**
 * @author Henry.Ouyang
 * @since 2020/05/03
 * @version 1.0.1 (2020/05/07)
 */

public class Main {
	
	Scanner in = new Scanner(System.in);
	
	/**
	 * Main Application
	 * @param args
	 */
	public static void main(String[] args) {
		//XXX For the use of debug, not functionally implemented yet. 
		
		TimeInstant begin1 = new TimeInstant(8, 30, 0);
		TimeInstant end1 = new TimeInstant(9, 30, 0);
		
		TimeInterval interval1 = new TimeInterval(begin1, end1);
		
		//System.out.println(interval1.toString());
		
		Schedule sche1_1 = new Schedule("Lecture", "101", "MWF", interval1);
		Schedule sche1_2 = new Schedule("Tutorial", "L1N", "M", interval1);
		//ArrayList<Schedule> scheList1 = new ArrayList<Schedule>();
		
		//Adding schedules
		Course course1 = new Course("CPSC101");
		course1.addSchedule(sche1_1, sche1_2);
		

		Course.printCourse(course1);
		
	}
}
