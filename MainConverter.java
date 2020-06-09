// mainConverter.java
// sub-classes to methods?
// for an example:
/* x coord converter into one method and
   z coord converter into one method?
 */   
   
public class MainConverter
{
   public static void main(String[] args)
   {
      // Example
      System.out.println(xCoordConverter(80) + ", yCoord, zCoord");
      
      
      
   }
   
   public static int xCoordConverter(int xCoord)
   {
      int convertedXCoord = 0;
      convertedXCoord = xCoord/8;
      return convertedXCoord;
       
   }
   
}
