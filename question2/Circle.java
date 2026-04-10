package question2;

public class Circle extends ClosedFigure {
    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y, double radius) {
        
        super(1); 
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    
    @Override
    public String toString() {
        return "Circle(" + x + "," + y + "," + radius + ")";
    }

    // Determine whether the circle is inscribed in the given object
    public boolean isInscribed(Object object) {
        if (object instanceof Rectangle) {
            Rectangle rect = (Rectangle) object;
            
            // 1. Determine whether it is a square
            boolean isSquare = (rect.getLength() == rect.getWidth());
            
            // 2. Determine whether the diameter of a circle is equal to the side length of a square
            boolean diameterMatch = (2 * this.radius == rect.getLength());
            
            // 3. Calculate the coordinates of the center of the rectangle and compare them with the center of the circle
            
            double rectCenterX = rect.getX() + rect.getLength() / 2.0;
            double rectCenterY = rect.getY() - rect.getWidth() / 2.0; 
            
            boolean centerMatch = (this.x == rectCenterX && this.y == rectCenterY);

            return isSquare && diameterMatch && centerMatch;
        }
        
        
        return false; 
    }
}
