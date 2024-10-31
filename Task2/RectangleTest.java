package Task2;

public class RectangleTest {
 public static void main(String[] args) {
     Rectangle rect = new Rectangle();


     System.out.println("Default Length: " + rect.getLength());
     System.out.println("Default Width: " + rect.getWidth());
     System.out.println("Default Area: " + rect.calculateArea());
     System.out.println("Default Perimeter: " + rect.calculatePerimeter());


     rect.setLength(15.5);
     rect.setWidth(10.0);

     System.out.println("\nUpdated Length: " + rect.getLength());
     System.out.println("Updated Width: " + rect.getWidth());
     System.out.println("Updated Area: " + rect.calculateArea());
     System.out.println("Updated Perimeter: " + rect.calculatePerimeter());


     rect.setLength(25.0);  
     rect.setWidth(-5.0);   
 }
}
