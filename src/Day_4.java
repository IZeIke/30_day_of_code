import java.util.Scanner;

public class Day_4 {
    private int age;

    public Day_4(int initialAge) {
        // Add some more code to run some checks on initialAge
        if(initialAge < 0){
            System.out.println("Age is not valid, setting age to 0.");
            age = 0;
        }else {
            age = initialAge;
        }

    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        String str;
        if(age < 13){
            str = "You are young.";
        }else if(age < 18){
            str = "You are a teenager.";
        }else {
            str = "You are old.";
        }
        System.out.println(str);
    }

    public void yearPasses() {
        // Increment this person's age.
        age++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Day_4 p = new Day_4(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
