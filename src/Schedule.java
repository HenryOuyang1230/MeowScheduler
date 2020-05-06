/**
 * @author Henry.Ouyang
 * @since 2020/05/06
 * @version 1.0.1 (2020/05/07)
 */

public class Schedule {
	
	
	//Default values of scheduleTypes: Lecture, Lab, Tutorial
	private String scheduleType;
	private String scheduleID;
	//Default values of daoOfWeek: MWF, TT, MTTF
	private String dayOfWeek;
	private TimeInterval timeInterval;
	
	//Constructors
	/**
	 * Create a new object
	 */
	public Schedule() {
		scheduleType = "N/A";
		scheduleID = "N/A";
		dayOfWeek = "N/A";
		timeInterval = new TimeInterval();
	}
	
	/**
	 * Create a new object
	 * @param sType a {@code String} representing types of schedule (Lecture, Tutorial, Lab, etc.)
	 * @param sID a {@code String} representing ID of the schedule (101, L1N, etc.)
	 * @param dow an integer representing the specific day of a week (1 = Monday, 2 = Tuesday, etc.) 
	 * @param iInt a {@code TimeInterval} object representing the interval of time in the schedule
	 */
	public Schedule(String sType, String sID, String dow, TimeInterval tInt) {
		scheduleType = sType;
		scheduleID = sID;
		dayOfWeek = dow;
		timeInterval = new TimeInterval(tInt.getBegin(), tInt.getEnd());
	}
	
	//Assessors
	/**
	 * Return the type of the schedule(Lecture, Lab, Tutorial, etc.)
	 * @return a {@code String} value containing the type of the schedule
	 */
	public String getScheduleType() {
		return scheduleType;
	}
	
	/**
	 * Return the ID of the Schedule;
	 * @return a {@code String} value representing the ID of the schedule
	 */
	public String getScheduleID() {
		return scheduleID;
	}
	
	/**
	 * Return the day of a week
	 * @return an integer representing the specific day of a week in for the schedule
	 */
	public String getDayOfWeek() {
		return dayOfWeek;
	}
	
	/**
	 * Return the time interval
	 * @return a {@code TimeInterval} object representing the interval of time in the schedule
	 */
	public TimeInterval getTimeInterval() {
		TimeInterval tInt = new TimeInterval(timeInterval.getBegin(), timeInterval.getEnd());
		return tInt;
	}
	
	/**
	 * Determine whether the schedule overlaps another schedule
	 * @param otherSchedule another {@code Schedule} object value for overlap determination (no minimum minute between two Schedule set, {@link })
	 * @return a boolean value representing if it overlaps another {@code Schedule} object
	 * @see {@code Schedule.isOverlapping(Schedule otherSchedule, int minGapMinute)}
	 */
	public boolean isOverlapping(Schedule otherSchedule) {
		//FIXME determining whether on the same days of a week, to be fixed. 
		//on different days
		if(!this.dayOfWeek.equals(otherSchedule.dayOfWeek)) {
			return false;
		}
		//on the same day
		else {
			if(timeInterval.getBegin().isLater(otherSchedule.getTimeInterval().getEnd())
					|| otherSchedule.getTimeInterval().getBegin().isLater(timeInterval.getEnd())) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Determine whether the schedule overlaps another schedule
	 * @param otherSchedule another {@code Schedule} object value for overlap determination
	 * @param minGapMinute an integer (default to 0 if not given) representing the minimum minute between two {@code Schedule} objects
	 * @return a boolean value representing if overlaps another {@code Schedule} object
	 * @see {@code Schedule.isOverlapping(Schedule otherSchedule)}
	 */
	public boolean isOverlapping(Schedule otherSchedule, int minGapMinute) {
		//TODO to be complete
		return true;
	}
}
