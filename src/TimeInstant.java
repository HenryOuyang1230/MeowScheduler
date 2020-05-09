/**
 * @author Henry.Ouyang
 * @since 2020/05/06
 * @version 1.0.1 (2020/05/09)
 */

public class TimeInstant {

	private int hour;
	private int minute;
	private int second;
	
	//Constructors
	/**
	 * Create a new object
	 */
	public TimeInstant() {
		hour = 0;
		minute = 0;
		second = 0;
	}
	
	/**
	 * Create a new object
	 * @param hour the hour value between 0 and 24
	 * @param minute the minute value between 0 and 60
	 * @param second the second value between 0 and 60
	 */
	public TimeInstant(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		fixDisplayedTime();
	}
	
	//Assessors
	/**
	 * @return an integer of the hour value
	 */
	public int getHour() {
		return hour;
	}
	
	/**
	 * @return an integer of the minute value
	 */
	public int getMinute() {
		return minute;
	}
	
	/**
	 * @return an integer of the second value
	 */
	public int getSecond() {
		return second;
	}
	
	/**
	 * Return the total seconds from the start of a day
	 * @return a long integer contains number of seconds from the start of a day
	 */
	public long ofSec() {
		return hour * 3600 + minute * 60 + second;
	}
	
	/**
	 * Compare the sequence (early or late) of this and another one time instant. 
	 * Return a positive value if earlier and a negative value if later. 
	 * @param otherTimeInstant another {@code TimeInstant} object for comparison
	 * @return the difference of seconds (from 00:00) between this instant and another {@code TimeInstant} object
	 */
	public long compareToSec(TimeInstant otherTimeInstant) {
		return this.ofSec() - otherTimeInstant.ofSec();
	}
	
	/**
	 * Determine whether this instant is later than another time instant
	 * @param otherTimeInstant another {@code TimeInstant} object for comparison
	 * @return a boolean value representing whether it is later than another {@code TimeInstant} object
	 */
	public boolean isLater(TimeInstant otherTimeInstant) {
		return this.compareToSec(otherTimeInstant) > 0;
	}
	
	/**
	 * Formatted output
	 */
	public String toString() {
		//XXX could be updated
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	//Mutators
	/**
	 * Add seconds to the current time instant. 
	 * The values will be ensured to be within the right ranges by automatically 
	 * calling {@link fixDisplayedTime()} by the end of the method. 
	 * @param secondsAdded an integer containing the number of seconds add to the time instant, could be either positive or negative. 
	 * @see {@code TimeInstant.fixDisplayedTime()}  
	 */
	public void addSeconds(int secondsAdded) {
		this.second += secondsAdded;
		fixDisplayedTime();
	}
	
	/**
	 * Add minutes to the current time instant. 
	 * The values will be ensured to be within the right ranges by automatically 
	 * calling {@link fixDisplayedTime()} by the end of the method.
	 * @param minutesAdded an integer containing the number of minutes add to the time instant, could be either positive or negative. . 
	 * @see {@code TimeInstant.fixDisplayedTime()}  
	 */
	public void addMinutes(int minutesAdded) {
		this.minute += minutesAdded;
		fixDisplayedTime();
	}
	
	/**
	 * Add hours to the current time instant. 
	 * The values will be ensured to be within the right ranges by automatically 
	 * calling {@link fixDisplayedTime()} by the end of the method.
	 * @param hoursAdded an integer containing the number of hours add to the time instant, could be either positive or negative. . 
	 * @see {@code TimeInstant.fixDisplayedTime()}  
	 */
	public void addHours(int hoursAdded) {
		this.hour = hoursAdded;
		fixDisplayedTime();
	}
	
	/**
	 * To be called ONLY in this class.
	 * Fix the values of hour, minute, and seconds if not within ranges. 
	 * To be called right after the values are modified. 
	 * @see {@code TimeInstant.addSeconds(int secondsAdded)}
	 * @see {@code TimeInstant.addMinutes(int minutesAdded)}
	 * @see {@code TimeInstant.addHours(int hoursAdded)}
	 */
	private void fixDisplayedTime() {
		if(second >= 60) {
			int toMinute = second / 60;
			minute += toMinute;
			second %= 60;
		}
		if(minute >= 60) {
			int toHour = minute / 60;
			hour += toHour;
			minute %= 60;
		}
		if(hour >= 24) {
			hour -= 24;
		}
	}
}
