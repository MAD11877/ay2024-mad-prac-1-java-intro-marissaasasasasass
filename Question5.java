import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);

    ArrayList<Integer> data = new ArrayList<>();

    System.out.print("Length of list: ");
    int length = in.nextInt();

    for (int i=0; i<length; i++)
    {
      int number = in.nextInt();
      data.add(number);
    }

        // Sorting the ArrayList
        Collections.sort(data);

        // Finding the mode (number with the highest occurrence)
        int mode = data.get(0);
        int previous = 1;
        int count = 1;
        for (int i = 1; i < length; i++) {
            if (data.get(i).equals(data.get(i - 1))) 
            {
                count++;
            } 
            else 
            {
                if (count> previous) 
                {
                    previous = count;
                    mode = data.get(i - 1);
                }
                count = 1;
            }
        }

        // Check for the mode in case it is the last element in the list
        if (count > previous) 
        {
            mode = data.get(length - 1);
        }

        System.out.println("Mode: " + mode);
    }
}
