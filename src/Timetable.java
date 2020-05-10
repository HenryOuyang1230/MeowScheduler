import java.util.ArrayList;

/**
 * @author Henry.Ouyang
 * @since 2020/05/10
 * @version 1.0.1 (2020/05/10)
 */

public class Timetable {
	
	private String session;
	private int totalCredits;
	private ArrayList<Course> courseList;
	
	//Constructors
	/**
	 * Create an object
	 */
	public Timetable() {
		session = "N/A";
		totalCredits = 0;
		courseList = new ArrayList<Course>();
	}
	
	/**
	 * Create an object, with session ID assigned. 
	 * @param sessionAssigned the name or ID of the session the time table is created for
	 */
	public Timetable(String sessionAssigned) {
		session = sessionAssigned;
		totalCredits = 0;
		courseList = new ArrayList<Course>();
	}
	
	//Assessors
	/**
	 * Return the session name of the time table
	 * @return a {@code String} object containing the name of the session of the time table
	 */
	public String getSession() {
		return session;
	}
	
	/**
	 * Return the total credits in the time table
	 * @return an integer containing the total credits in the timetable
	 */
	public int getTotalCredits() {
		return totalCredits;
	}
	
	/**
	 * Return the full list of courses in this time table
	 * @return an `Course` array containing all courses in this time table;
	 */
	public Course[] getCourseList() {
		//TODO to be tested
		return courseList.toArray(new Course[courseList.size()]);
	}
	
	//Mutators
	/**
	 * @param courseAdded
	 */
	public void addCourse(Course courseAdded) {
		//TODO to be tested
		courseList.add(courseAdded);
		fixTotalCredits();
	}
	
	/**
	 * @param courseDeleted
	 */
	public void deleteCourse(Course courseDeleted) {
		//TODO to be tested
		courseList.remove(courseDeleted); //XXX uncertain use of method
		fixTotalCredits();
	}
	
	/**
	 * Fix the number of total credits in the time table.
	 * Should be called right after modifying the course list. 
	 * @see {@code TimeTable.addCourse(Course courseAdded)}
	 * @see {@code TimeTable.deleteCourse(Course courseDeleted)}
	 */
	private void fixTotalCredits() {
		//TODO to be tested
		int fixedCredits = 0;
		for(Course course : courseList) {
			fixedCredits += course.getCredits();
		}
		//Modify the data field
		totalCredits = fixedCredits;
	}
	
	//Static Methods
	/**
	 * Formatted printing the timetable
	 */
	public static void printTimetable() {
		//TODO to be implemented
		
	}
}
