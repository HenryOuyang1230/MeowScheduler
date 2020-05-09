import java.util.Scanner;

/**
 * @author Henry.Ouyang
 * @since 2020/05/03
 * @version 1.0.1 (2020/05/09)
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
		TimeInstant begin2 = new TimeInstant(10, 00, 0);
		TimeInstant end2 = new TimeInstant(11, 00, 00);
		
		TimeInterval interval1 = new TimeInterval(begin1, end1);
		TimeInterval interval2 = new TimeInterval(begin2, end2);
				
		Schedule sche1_1 = new Schedule("Lecture", "101", "MWF", interval1);
		Schedule sche1_2 = new Schedule("Tutorial", "L1N", "MWF", interval2);
		
		//Adding schedules
		Course course1 = new Course("CPSC101");
		course1.addSchedule(sche1_1, sche1_2);
		
		Course.printCourse(course1);
		
		//Testing time display
		TimeInstant time = new TimeInstant(24, 40, 0);
		System.out.println(time);
		time.addMinutes(80);
		System.out.println(time);
		
		//Testing interval extension
		System.out.println(interval1);
		interval1.extendMinute(-30);
		System.out.println(interval1);
		
		System.out.println(course1.getscheduleList().get(0).isOverlapping(course1.getscheduleList().get(1), 30));
	}
}
