package question1;
public class Start {
	public static void main(String[] args) {
		
		PoliceDog dogOne= new PoliceDog("little", 30.0), dogTwo= new PoliceDog("super", 40.0);
		Police p1 = new Police("Sir O", 101), p2 = new Police("Sir T", 102);
		int week1DogOneHours[] = {2, 2, 2, 2, 2, 2, 2}; // training hours in the first week for dogOne
		int week1DogTwoHours[] = {3, 3, 3, 3, 3, 3, 3}; // training hours in the first week for dogTwo
		
		int week2DogOneHours[] = {3, 3}; // training hours in the second week for dogOne
		int week2DogTwoHours[] = {4, 4}; // training hours in the second week for dogTwo
		
		String weekDays[]= {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		dogOne.setTrainer(p1);
		dogTwo.setTrainer(p2);
		
		dogOne.setBreed("Rottweiler");
		dogTwo.setBreed("Boxer");
		
		//first week test
		for (int i = 0; i <= 6; i++) {
			System.out.println(dogOne.getTrainer().getName() + ": the training hours for " + dogOne.getName() + " on " + weekDays[i] + ": " + week1DogOneHours[i] + " hours.");
			dogOne.train(week1DogOneHours[i]);
			
			System.out.println(dogTwo.getTrainer().getName() + ": the training hours for " + dogTwo.getName() + " on " + weekDays[i] + ": " + week1DogTwoHours[i] + " hours.");
			dogTwo.train(week1DogTwoHours[i]);
			
		}
		System.out.println(dogOne.getName() + " in the first week: " + dogOne.getWeekHours() + " hours.");
		System.out.println(dogTwo.getName() + " in the first week: " + dogTwo.getWeekHours() + " hours.");
		System.out.println("Total hours: " + PoliceDog.getTotalHours() + " hours.");
		//second week test
		for (int i = 0; i <= 1; i++) {
			System.out.println(dogOne.getTrainer().getName() + ": the training hours for " + dogOne.getName() + " on " +  weekDays[i] + ": " + week2DogOneHours[i]+ " hours.");
			dogOne.train(week2DogOneHours[i]);
			
			System.out.println(dogTwo.getTrainer().getName() + ": the training hours for " + dogTwo.getName() + " on " +  weekDays[i] + ": " + week2DogTwoHours[i]+ " hours.");
			dogTwo.train(week2DogTwoHours[i]);
		}
		System.out.println(dogOne.getName() + " in the second week: " + dogOne.getWeekHours() + " hours.");
		System.out.println(dogTwo.getName() + " in the second week: " + dogTwo.getWeekHours() + " hours.");
    	System.out.println("Total hours: " + PoliceDog.getTotalHours() + " hours.");
	}
	
}