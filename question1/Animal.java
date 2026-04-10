package question1;

public class Animal {
	private String name;
	private double weight;
	public  Animal(String name, double weight) {
		this.name=name;
		this.weight=weight;
		
	}
	public String getName() {
		return name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double newweight) {
		this.weight=newweight;
	}
	
}