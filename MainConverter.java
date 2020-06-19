// mainConverter.java

 
import java.util.ArrayList;  import java.lang.Math;   import java.util.Scanner;
   
public class MainConverter
{
   public static void main(String[] args)
   { 
      ArrayList<String> coordArrays = new ArrayList<>();
      System.out.print("\n\nPut your Nether Portal at these Coordinates in the Nether: " + coordConverter(coordUserInput(coordArrays, "X"), true) + ", " + coordConverter(coordUserInput(coordArrays, "Y"), false) + ", " + coordConverter(coordUserInput(coordArrays, "Z"), true));
   }
   
   public static double coordUserInput(ArrayList<String> coordArray, String dialog)
   {
      Double coordNum;
      Scanner coordUserInput = new Scanner(System.in);
      System.out.print("\nEnter " + dialog + " Coordinate -->  ");  
      String coord = coordUserInput.nextLine();
      coordArray.add(coord);
      if(isNumeric(coordArray.get(coordArray.size() - 1)))
      {
         coordNum = new Double(coordArray.get(coordArray.size() - 1));
         return coordNum;
      }
      else
      {
            System.out.println("\nDon't be Silly! Enter a NUMBER for the " + dialog +  " Coordinate..."); 
            coordUserInput(coordArray, dialog);
      }
    coordNum = new Double(coordArray.get(coordArray.size() - 1));
    return coordNum; 
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

   public static int coordConverter(double coord, boolean convert)
   {
      int convertedCoord = 0;
      if(convert)
         convertedCoord = (int) (Math.round(coord/8));
      else
         convertedCoord = (int) coord;
      return convertedCoord; 
   }
}
