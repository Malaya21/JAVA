//In java there are many ways to take input from user
//Command line input 
//Using scanner class
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        System.out.println(args[0]);
try (Scanner Sc = new Scanner(System.in)) {
    int num = Sc.nextInt();
     System.out.println(num);
}
  


    }
    
}