// mainConverter.java
// sub-classes to methods?
// for an example:
/* x coord converter into one method and
   z coord converter into one method?
 */
 
import java.lang.Math;
   
public class MainConverter
{
   public static void main(String[] args)
   {
      // Example
      System.out.println(xCoordConverter(7695) + ", yCoord, " + zCoordConverter(7695));
      
      
      
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
