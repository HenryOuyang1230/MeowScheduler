/**
 * @author Henry.Ouyang
 * @since 2020/05/06
 * @version 1.0.1 (2020/05/07)
 */


public class TimeInterval {
	private TimeInstant tBegin;
	private TimeInstant tEnd;
	
	//Constructors
	/**
	 * Create a new object
	 */
	public TimeInterval() {
		tBegin = new TimeInstant();
		tEnd = new TimeInstant();
	}
	
	/**
	 * Create a new object
	 * @param begin beginning instant of the interval
	 * @param end ending instant of the interval
	 */
	public TimeInterval(TimeInstant begin, TimeInstant end) {
		tBegin = new TimeInstant(begin.getHour(), begin.getMinute(), begin.getSecond());
		tEnd = new TimeInstant(end.getHour(), end.getMinute(), end.getSecond());
	}
	
	//Assessors
	/**
	 * Return the begin instant
	 * @return a {@code TimeInstant} object representing the begin instant
	 */
	public TimeInstant getBegin() {
		TimeInstant beginInstant = new TimeInstant(tBegin.getHour(), tBegin.getMinute(), tBegin.getSecond());
		return beginInstant;
	}
	
	/**
	 * Return the end instant
	 * @return a {@code TimeInstant} object representing the end instant
	 */
	public TimeInstant getEnd() {
		TimeInstant endInstant = new TimeInstant(tEnd.getHour(), tEnd.getMinute(), tEnd.getSecond());
		return endInstant;
	}
	
	/**
	 * Formatted output
	 */
	public String toString() {
		return tBegin.toString() + " - " + tEnd.toString();
	}
}
