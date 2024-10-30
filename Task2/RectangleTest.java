package Task2;
//Test program
public class RectangleTest {
 public static void main(String[] args) {
     Rectangle rect = new Rectangle();

     // Display default values
     System.out.println("Default Length: " + rect.getLength());
     System.out.println("Default Width: " + rect.getWidth());
     System.out.println("Default Area: " + rect.calculateArea());
     System.out.println("Default Perimeter: " + rect.calculatePerimeter());

     // Set new values
     rect.setLength(15.5);
     rect.setWidth(10.0);

     // Display updated values
     System.out.println("\nUpdated Length: " + rect.getLength());
     System.out.println("Updated Width: " + rect.getWidth());
     System.out.println("Updated Area: " + rect.calculateArea());
     System.out.println("Updated Perimeter: " + rect.calculatePerimeter());

     // Attempt to set invalid values
     rect.setLength(25.0);  // Invalid
     rect.setWidth(-5.0);   // Invalid
 }
}
