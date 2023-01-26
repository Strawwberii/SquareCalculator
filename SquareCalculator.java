import java.util.Scanner;

/* SquareCalcs- program that would calculate the perimeter 
 * and area of a square
 */

 public class SquareCalculator
 {
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);

        //input values
        double length = 0;
        double perimeter = 0;
        double area = 0;
        
        //display prompts
        System.out.println ("What is the length of the square? ");
        length= scan.nextDouble();
        
        //not accepting negative numbers
        if (length<0.0)
        System.out.println( " length cannot be negative dummy" );
        
        //calculation
        perimeter = length * 4; 
        area = length * length;
        
        //display results
        if (length>=0)
        
        System.out.println ("With the length of " + length + ", ");
        System.out.println ("perimeter: " + perimeter + ", area: " + area);

    }
    


 }