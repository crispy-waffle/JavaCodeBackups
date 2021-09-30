import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    double segment1;
    double segment2;
    double segment3;
    double totalDistance;
    Scanner scan = new Scanner(System.in);
    
   
   //prompts input for segment length
    System.out.println("Enter length of segment one");
    segment1 = scan.nextDouble();

    System.out.println("Enter length of segment two");
    segment2 = scan.nextDouble();

    System.out.println("Enter length of segment three");
    segment3 = scan.nextDouble();
    
    
    
   //adds total distance
    totalDistance = segment1 + segment2 + segment3; 

   
   // prints total distance
    System.out.println("Total distance is " + totalDistance);
    
  }
}