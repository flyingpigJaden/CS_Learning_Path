package question1;

public class PoliceDog extends Dog {
	private int weekHours;
	private static int totalHoursForAll;
	private int times;
	private Police trainer;
	
	public PoliceDog(String name, double weight) {
		super(name, weight);
	}
	
	// Responsible for tracking cumulative time, counting the number of occurrences, and resetting the count at the start of each new week
	public void train(int hours) {
		// If `times` is already a multiple of 7 (and greater than 0), it means the previous week has ended and the new week has just begun, so reset to zero.
		if (this.times > 0 && this.times % 7 == 0) {
			this.weekHours = 0; 
		}
		
		this.weekHours += hours;     // Total hours for this week
		totalHoursForAll += hours;   // Sum the total duration for all dogs
		this.times++;                // Increase the number of training sessions
	}
	
	public Police getTrainer() {
		return trainer;
	}
	
	public void setTrainer(Police trainer) {
		this.trainer = trainer;
	}
	
	
	public int getWeekHours() {
		// If the number of training sessions isn't a multiple of 7, it means the week isn't over yet.
		if (this.times % 7 != 0) {
			System.out.println("Not a week yet.");
		}
		return this.weekHours;       
	}
	
	public static int getTotalHours() {
		return totalHoursForAll;
	}
}
