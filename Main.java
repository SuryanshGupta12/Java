import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Your code goes here
        //For user input
        Scanner sc = new Scanner(System.in);
        //Heading
        System.out.println("CBSE Board percentage Calculator");
        //Taking input
        System.out.println("Enter your marks of English:");
        float a = sc.nextFloat();
        System.out.println("Enter your marks of Maths:");
        float b = sc.nextFloat();
        System.out.println("Enter your marks of Science:");
        float c = sc.nextFloat();
        System.out.println("Enter your marks of Hindi:");
        float d = sc.nextFloat();
        System.out.println("Enter your marks of IT:");
        float e = sc.nextFloat();
        System.out.println("Your total percentage is:");
        float ttl = a+b+c+d+e;
        System.out.println((ttl/500)*100);
        //end of code
    }
}