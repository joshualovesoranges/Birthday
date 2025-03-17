import java.util.Scanner;

public class BirthdayTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //asks user to enter the size of the class
        System.out.print("Enter class size: ");
        int classSize = scanner.nextInt();

        //asks user to enter the amount of trials
        System.out.print("Enter the amount of trials: ");
        int trials = scanner.nextInt();

        BirthdayFinder tester = new BirthdayFinder(classSize, trials);



        System.out.println("the probability of two people sharing a birthday in the class:" + tester.simulation());

        scanner.close();
    }
}
