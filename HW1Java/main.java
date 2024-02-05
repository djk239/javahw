import java.util.Scanner;
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String[] args) //DRIVER CODE | ACCEPTS USER INPUT FOR SEQUENCES
    {
        Sequence sec1 = new Sequence();
        Sequence sec2 = new Sequence();
        Scanner scanner = new Scanner(System.in);
        String input = "";
        
        while(input != "exit")
        {
            System.out.println("Please enter your values for Sequence 1, enter c when you are done");
            String value = scanner.nextLine();
            while(!value.equals("c"))
            {
                try
                {
                    sec1.add(Integer.parseInt(value));
                }catch (NumberFormatException e){
                    System.out.println("You have to enter an integer. Try again.");
                }
                
                value = scanner.nextLine();
            }
            System.out.println("Okay now enter values for Sequence 2, enter c when you are done");
            value = scanner.nextLine();
            while(!value.equals("c"))
            {
                try
                {
                    sec2.add(Integer.parseInt(value));
                }catch (NumberFormatException e){
                    System.out.println("You have to enter an integer. Try again.");
                }
                
                value = scanner.nextLine();
            }
            
            Sequence appended = sec1.append(sec2);
            Sequence merged = sec1.merge(sec2);
            Sequence mergeSorted = sec1.mergeSorted(sec2);
            System.out.println("Here are your three new sequences:");
            System.out.println("Appended: " + appended.toString());
            System.out.println("Merged: " + merged.toString());
            System.out.println("Merged Sorted: " + mergeSorted.toString());
            System.out.println("\nEnter anything to continue, type exit to quit");
            input = scanner.nextLine();
            
        }
            
        }
    
    public static void alternative(int[] Sequence1, int[] Sequence2) // RUN THIS DRIVER TO ENTER VALUES UPON RUN 
    {                                                                // ON BLUEJAY IDE (be sure to inclue {} in input)
        Sequence sec1 = new Sequence();
        Sequence sec2 = new Sequence();
        for (int val : Sequence1)
        {
            sec1.add(val);
        }
        for (int val : Sequence2)
        {
            sec2.add(val);
        }
        
        Sequence appended = sec1.append(sec2);
        Sequence merged = sec1.merge(sec2);
        Sequence mergeSorted = sec1.mergeSorted(sec2);
        System.out.println("Here are your three new sequences:");
        System.out.println("Appended: " + appended.toString());
        System.out.println("Merged: " + merged.toString());
        System.out.println("Merged Sorted: " + mergeSorted.toString());
    }
    }
