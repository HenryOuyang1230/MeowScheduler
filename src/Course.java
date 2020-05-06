import java.util.ArrayList;

/**
 * @author Henry.Ouyang
 * @since 2020/05/06
 * @version 1.0 (2020/05/06)
 */

public class Course {
	
	private String courseID;
	private ArrayList<Schedule> scheduleList;
	
	//Constructors
	/**
	 * Create a new object
	 */
	public Course() {
		courseID = "N/A";
		scheduleList = new ArrayList<Schedule>();
	}

	/**
	 * Create a new object
	 * @param cID class id, i.e. CS101
	 * @param sList
	 */
	public Course(String cID, ArrayList<Schedule> sList) {
		courseID = cID;
		scheduleList = sList;
	}
	
	/**
	 * Create a new object
	 * @param cID class id, i.e. CS101
	 */
	public Course(String cID) {
		courseID = cID;
		scheduleList = new ArrayList<Schedule>();
	}
	
	//Assessors
	/**
	 * Return the schedule list
	 * @return an ArrayList containing the full list of schedules in the course
	 */
	public ArrayList<Schedule> getscheduleList() {
		return scheduleList;
	}
	
	//Mutators
	/**
	 *  
	 * @param schedule
	 */
	public void addSchedule(Schedule schedule) {
		//TODO add schedule(s)
	}
	
	//Static Methods
	/**
	 * Formatted printing the course schedules
	 * @param course a Course object for printing
	 */
	public static void printCourse(Course course) {
		System.out.println("--------------------------" + course.courseID + "--------------------------");
		for (int i=0; i<course.scheduleList.size(); i++) {
			System.out.println(course.courseID + " " + course.scheduleList.get(i).getScheduleID() + "\t" + 
					course.scheduleList.get(i).getScheduleType() + "\t\t" + 
					course.scheduleList.get(i).getDayOfWeek() + "\t" + 
					course.scheduleList.get(i).getTimeInterval().toString());
		}
	}
}
