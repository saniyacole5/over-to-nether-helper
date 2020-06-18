// mainConverter.java
// sub-classes to methods?
// for an example:
/* x coord converter into one method and
   z coord converter into one method?
 */
 
import java.util.ArrayList;  import java.lang.Math;   import java.util.Scanner;
   
public class MainConverter
{
   public static void main(String[] args)
   { 
      ArrayList<String> coordArrays = new ArrayList<>();
      System.out.print("\n\nPut your Nether Portal at these Coordinates in the Nether: " + xCoordConverter(xCoordUserInput(coordArrays)) + ", " + yCoordUserInput(coordArrays) + ", " + zCoordConverter(zCoordUserInput(coordArrays)));
   }
   
   public static double xCoordUserInput(ArrayList<String> coordArray)
   {
      Double xCoordNum;
      Scanner xCoordUserInput = new Scanner(System.in);
      System.out.print("\nEnter X Coordinate -->  ");
      String xCoord = xCoordUserInput.nextLine();
      coordArray.add(xCoord);
      if(isNumeric(coordArray.get(coordArray.size() - 1)))
      {
         xCoordNum = new Double(coordArray.get(coordArray.size() - 1));
         return xCoordNum;
      }
      else
      {
         System.out.println("\nDon't be Silly! Enter a NUMBER for the X Coordinate...");
         xCoordUserInput(coordArray);
      }
    xCoordNum = new Double(coordArray.get(coordArray.size() - 1));
    return xCoordNum; 
   }
   
   public static double yCoordUserInput(ArrayList<String> coordArray)
   {
      Double yCoordNum;
      Scanner yCoordUserInput = new Scanner(System.in);
      System.out.print("\nEnter Y Coordinate -->  ");
      String yCoord = yCoordUserInput.nextLine();
      coordArray.add(yCoord);
      if(isNumeric(coordArray.get(coordArray.size() - 1)))
      {
         yCoordNum = new Double(coordArray.get(coordArray.size() - 1));
         return yCoordNum;
      }
      else
      {
         System.out.println("\nDon't be Silly! Enter a NUMBER for the Y Coordinate...");
         yCoordUserInput(coordArray);
      }
    yCoordNum = new Double(coordArray.get(coordArray.size() - 1));
    return yCoordNum; 
   }
   
   public static double zCoordUserInput(ArrayList<String> coordArray)
   {
      Double zCoordNum;
      Scanner zCoordUserInput = new Scanner(System.in);
      System.out.print("\nEnter Z Coordinate -->  ");
      String zCoord = zCoordUserInput.nextLine();
      coordArray.add(zCoord);
      if(isNumeric(coordArray.get(coordArray.size() - 1)))
      {
         zCoordNum = new Double(coordArray.get(coordArray.size() - 1));
         return zCoordNum;
      }
      else
      {
         System.out.println("\nDon't be Silly! Enter a NUMBER for the Z Coordinate...");
         zCoordUserInput(coordArray);
      }
    zCoordNum = new Double(coordArray.get(coordArray.size() - 1));
    return zCoordNum; 
   }

   public static boolean isNumeric(String str)
   {
      try 
      {  
         Double.parseDouble(str);  
         return true;
      } 
      catch(NumberFormatException e)
      {  
         return false;  
      }
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
