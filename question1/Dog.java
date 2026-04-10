package question1;

public class Dog extends Animal {
	private String breed;
	public Dog(String name, double weight) {
        super(name, weight); 
        breed="unknown";
    }
	public String getBreed() {
		return breed;
		
	}
	public void setBreed(String newBreed) {
		this.breed= newBreed;
	}
	public void feed() {
        
        double currentWeight = this.getWeight();
        
        this.setWeight(currentWeight + 2);
        }

}