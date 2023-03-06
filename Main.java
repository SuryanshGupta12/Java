import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Question 1
        // Sum of three numbers
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a+ b+ c;
        System.out.println(sum);

        //Question 2
        //CGPA of three subjects
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int CGPA = (d+ e+ f)/3;
        System.out.println(CGPA);

        //Question 3
        //Greeting
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Hello "+ name+ ", Have a good day");

        //Question 4
        // KM to Miles
        System.out.println("Enter the number of KM");
        float KM = sc.nextFloat();
        double mile = KM/1.609;
        System.out.println("The number of miles are: " + mile);

        //Question 5
        //integer or not
        System.out.println("Enter your number");
        System.out.println(sc.hasNextInt());
    }
}