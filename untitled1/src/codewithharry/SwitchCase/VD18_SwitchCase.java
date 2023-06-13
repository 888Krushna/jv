package codewithharry.SwitchCase;
import java.util.Scanner;

public class VD18_SwitchCase {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        age=sc.nextInt();

        switch (age){
            case 18:
                System.out.println("your are adult");
                break;
            case 21:
                System.out.println("your ready to work");
                break;
                
            case 60:
                System.out.println("your are get retired");
                break;
            default:
                System.out.println("invaild entry");

        }
        System.out.println("thanks for attending quiz");
    }
}
