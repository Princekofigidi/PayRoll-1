import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter your name: ");
        String Name = in.nextLine();

        System.out.println();
        System.out.print("Hours Worked: ");
        int hours = sc.nextInt();

        System.out.println();
        System.out.print("Rate per Hour: ");
        Double payRate = sc.nextDouble();

        System.out.println();
        System.out.print("Dear, " + Name);

        Double grossPay = hours * payRate;

        System.out.println();
        System.out.println();
        System.out.println("Your Gross Pay is $"+ grossPay);

    }
}