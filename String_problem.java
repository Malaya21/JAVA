import java.util.Scanner;
public class String_problem {
    public static void main(String[] arga)
    {
        try (//In java if we take user input a string after an integer or other at that point problem arrises 
                //lets take an example
        Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter a number :");

            int num = scan.nextInt();
            System.out.println(num);

            // System.out.println("Enter a string ");
            // String str = scan.nextLine();
            // This statment will not exicuted 
            // System.out.println(str);

            //to avoid this problem we must have to use 
            System.out.println("Enter a string :");
            scan.nextLine();
            String str = scan.nextLine();
            System.out.println(str);
        }

    }
    
}
