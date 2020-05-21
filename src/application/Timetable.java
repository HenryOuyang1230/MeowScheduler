package application;
import java.util.ArrayList;

/**
 * @author Henry.Ouyang
 * @since 2020/05/10
 * @version 1.0.1 (2020/05/11)
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
		return courseList.toArray(new Course[courseList.size()]);
	}
	
	/**
	 * Auto schedule all courses in the course list for this time table. 
	 */
	public void autoSchedule() {
		//XXX to be implemented
	}
	
	//Mutators
	/**
	 * Add course(s) to the timetable. Ensure only one of the same courses exist in the same time table.
	 * @param courseAdded a {@code Course} object to be added to the timetable
	 */
	public void addCourse(Course... courseAdded) {
		for (Course course : courseAdded) {
			//Ensure only one same course exists. 
			for (Course courseExisted : courseList) {
				if (course.getCourseID().equals(courseExisted.getCourseID())) {
					return;
				}
			}
			courseList.add(course);
		}
		fixTotalCredits();
	}
	
	/**
	 * Delete a course from the timetable. 
	 * @param courseDeleted a {@code Course} object to be deleted from the timetable
	 * @see deleteCourse(String courseDeleted)
	 */
	public void deleteCourse(Course courseDeleted) {
		for (int i=0; i<courseList.size(); i++) {
			if (courseList.get(i).getCourseID().equals(courseDeleted.getCourseID())) {
				courseList.remove(i);
				fixTotalCredits();
				return;
			}	
		}
	}
	
	/**
	 * Delete a course from the timetable
	 * @param courseDeleted a {@code String} object containing the ID of course to be deleted from the timetable
	 * @see deleteCourse(Course courseDeleted)
	 */
	public void deleteCourse(String courseDeleted) {
		for (int i=0; i<courseList.size(); i++) {
			if (courseList.get(i).getCourseID().equals(courseDeleted)) {
				courseList.remove(i);
				return;
			}
		}
		fixTotalCredits();
	}
	
	/**
	 * Fix the number of total credits in the time table.
	 * Should be called right after modifying the course list. 
	 * @see {@code TimeTable.addCourse(Course courseAdded)}
	 * @see {@code TimeTable.deleteCourse(Course courseDeleted)}
	 */
	private void fixTotalCredits() {
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
	 * @param timetable a {@code Timetable} object for printing
	 */
	public static void printTimetable(Timetable timetable) {
		System.out.println();
		System.out.println("---Your Timetable---");
		System.out.println("Session: " + timetable.session);
		System.out.println("Total Credits: " + timetable.totalCredits);
		System.out.println("Courses(Credits): ");
		printCourseList(timetable);
	}
	
	private static void printCourseList(Timetable timetable) {
		//XXX could be optimized
		for(Course course : timetable.courseList) {
			System.out.println(course.getCourseID() + "(" + course.getCredits() + ")");
		}
	}
}
