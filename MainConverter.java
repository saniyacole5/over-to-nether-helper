// mainConverter.java
// sub-classes to methods?
// for an example:
/* x coord converter into one method and
   z coord converter into one method?
 */
 
import java.lang.Math;   import java.util.Scanner;
   
public class MainConverter
{
   public static void main(String[] args)
   {
      //Example
      Scanner xCoordUserInput = new Scanner(System.in);
      System.out.print("Enter X Coordinate -->  ");
      double xCoords = xCoordUserInput.nextDouble();
      
      Scanner yCoordUserInput = new Scanner(System.in);
      System.out.print("\nEnter Y Coordinate -->  ");
      double yCoord = yCoordUserInput.nextDouble();
      int yCoords = (int) yCoord; 
            
      Scanner zCoordUserInput = new Scanner(System.in);
      System.out.print("\nEnter Z Coordinate -->  ");
      double zCoords = zCoordUserInput.nextDouble();
      
      System.out.print("\n\nPut your Nether Portal at these Coordinates: " + xCoordConverter(xCoords) + ", " + yCoords + ", " + zCoordConverter(zCoords));      
      
      
      
      
   }
   
   public static int xCoordConverter(double xCoord)
   {
      int convertedXCoord = 0;
      convertedXCoord = (int) (Math.round(xCoord/8));
      return convertedXCoord;
       
   }
   
   public static int zCoordConverter(double zCoord)
   {
      int convertedZCoord = 0;
      convertedZCoord = (int) (Math.round(zCoord/8));
      return convertedZCoord;
   }
   
}
