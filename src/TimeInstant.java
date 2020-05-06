/**
 * @author Henry.Ouyang
 * @since 2020/05/06
 * @version 1.0 (2020/05/06)
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
	}
	
	//Assessors
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
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
	 * @param otherTimeInstant 
	 * @return the difference of seconds (from 00:00) between this instant and another TimeInstant object
	 */
	public long compareToSec(TimeInstant otherTimeInstant) {
		return this.ofSec() - otherTimeInstant.ofSec();
	}
	
	/**
	 * Determine whether this instant is later than another time instant
	 * @param otherTimeInstant another TimeInstant object for comparison
	 * @return a boolean value representing whether it is later than another TimeInstant object
	 */
	public boolean isLater(TimeInstant otherTimeInstant) {
		return this.compareToSec(otherTimeInstant) > 0;
	}
	
	/**
	 * Formatted output
	 */
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
}
