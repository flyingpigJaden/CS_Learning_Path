package question2;

public class Square extends Rectangle {

    public Square(double x, double y, double side) {
        // Call the constructor of the parent class Rectangle
        
        super(x, y, side, side); 
    }

    

    public String toString() {
        // Use the getter method provided by the parent class to retrieve data
        return "Square(" + getX() + "," + getY() + "," + getLength() + ")";
    }
    
    
}