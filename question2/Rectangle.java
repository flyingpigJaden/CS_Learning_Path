package question2;

public class Rectangle extends ClosedFigure {
    private double x;      
    private double y;      
    private double length; 
    private double width;  

    public Rectangle(double x, double y, double length, double width) {
        // edge 4
        super(4); 
        this.x = x;
        this.y = y;
        this.length = length;
        this.width = width;
    }

    // Provide a getter method to be called by the `isInscribed` method of the `Circle` class for calculation purposes
    public double getX() { return x; }
    public double getY() { return y; }
    public double getLength() { return length; }
    public double getWidth() { return width; }

    // Rewrite the method for calculating perimeter
    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
 
    @Override
    public String toString() {
        return "Rectangle(" + x + "," + y + "," + length + "," + width + ")";
    }
}