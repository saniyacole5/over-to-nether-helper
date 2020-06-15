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
      System.out.print("\n\nPut your Nether Portal at these Coordinates in the Nether: " + xCoordConverter(xCoordUserInput()) + ", " + yCoordUserInput() + ", " + zCoordConverter(zCoordUserInput()));
   }
   
   public static double xCoordUserInput()
   {
      Scanner xCoordUserInput = new Scanner(System.in);
      System.out.print("Enter X Coordinate -->  ");
      double xCoords = xCoordUserInput.nextDouble();
      return xCoords;
   }
   
   public static int yCoordUserInput()
   {
      Scanner yCoordUserInput = new Scanner(System.in);
      System.out.print("\nEnter Y Coordinate -->  ");
      double yCoord = yCoordUserInput.nextDouble();
      int yCoords = (int) yCoord;
      return yCoords;
   }
   
   public static double zCoordUserInput()
   {
      Scanner zCoordUserInput = new Scanner(System.in);
      System.out.print("\nEnter Z Coordinate -->  ");
      double zCoords = zCoordUserInput.nextDouble();
      return zCoords;
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
