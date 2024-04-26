import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in);

    double height = in.nextDouble();

    Double weight = in.nextDouble();

    Double BMI = weight / (height * height);

    System.out.println(String.format("%.2f", BMI));  
  }
}
