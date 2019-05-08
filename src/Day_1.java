import java.util.Scanner;

public class Day_1 {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int n = scan.nextInt();
        double n2 = scan.nextDouble();
        scan.nextLine();
        String ss = scan.nextLine();

        System.out.println( (n+i) + "" );
        System.out.println( (n2+d) + "" );
        System.out.println( s + ss );

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */

        scan.close();
    }
}
