import java.util.ArrayList;

/**
 * @author Henry.Ouyang
 * @since 2020/05/06
 * @version 1.0.1 (2020/05/07)
 */

public class Course {
	
	private String courseID;
	private int credits;
	private ArrayList<Schedule> scheduleList;
	
	//Constructors
	/**
	 * Create a new object
	 */
	public Course() {
		courseID = "N/A";
		credits = 0;
		scheduleList = new ArrayList<Schedule>();
	}

	/**
	 * Create a new object
	 * @param cID class id, i.e. CS101
	 * @param creditsAssigned an positive integer containing the credits assigned to the course
	 * @param sList an {@code ArrayList} containing the initial list of schedules in the course
	 */
	public Course(String cID, int creditsAssigned, ArrayList<Schedule> sList) {
		courseID = cID;
		credits = creditsAssigned;
		scheduleList = sList;
	}
	
	/**
	 * Create a new object
	 * @param cID class id, i.e. CS101
	 * @param creditsAssigned an positive integer containing the credits assigned to the course
	 */
	public Course(String cID, int creditsAssigned) {
		courseID = cID;
		credits = creditsAssigned;
		scheduleList = new ArrayList<Schedule>();
	}
	
	//Assessors
	/** Return the course ID
	 * @return an {@code String} object containing the ID of the course 
	 */
	public String getCourseID() {
		return courseID;
	}
	
	/**
	 * Return the credits assigned to the course
	 * @return an positive integer containing the cresits assigned to the course
	 */
	public int getCredits() {
		return credits;
	}
	
	/**
	 * Return the schedule list
	 * @return an {@code ArrayList} containing the full list of schedules in the course
	 */
	public ArrayList<Schedule> getscheduleList() {
		return scheduleList;
	}
	
	//Mutators
	/**
	 * Add new schedule(s) for this course
	 * @param schedules any number of {@code Schedule} objects for adding to the course
	 */
	public void addSchedule(Schedule... schedules) {
		for (Schedule schedule : schedules) {
			scheduleList.add(schedule);
		}
	}
	
	/**
	 * Add a list of schedules for this courses
	 * @param schedules an {@code ArrayList} containing a number of schedules for adding
	 */
	public void addSchedule(ArrayList<Schedule> schedules) {
		//XXX not recommended for use
		for (Schedule schedule : schedules) {
			scheduleList.add(schedule);
		}
	}
	
	//Static Methods
	/**
	 * Formatted printing the course schedules
	 * @param course a {@code Course} object for printing
	 */
	public static void printCourse(Course course) {
		System.out.println("------------------------" + course.courseID + " (" + course.credits + ")------------------------");
		for (int i=0; i<course.scheduleList.size(); i++) {
			System.out.println(course.courseID + " " + course.scheduleList.get(i).getScheduleID() + "\t" + 
					course.scheduleList.get(i).getScheduleType() + "\0\t" + 
					course.scheduleList.get(i).getDayOfWeek() + "\t" + 
					course.scheduleList.get(i).getTimeInterval().toString());
		}
	}
}
