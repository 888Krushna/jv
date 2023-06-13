package codewithharry;

import java.util.Scanner;

//write a program to calculate percenatge of agiaven student in cbse board exam . his marks from 5 subject must be
//taken as input from the keyborad (marks are outoff of 100)
public class VD6_excersie1 {
 public static void main (String[]args){
     Scanner scan = new Scanner(System.in);
     System.out.println("enter your physics marks: ");
     int physics = scan.nextInt();
     System.out.println("enter your maths marks:");
     int maths = scan.nextInt();
     System.out.println("enter your english marks:");
     int english = scan.nextInt();
     System.out.println("enter your chem marks:");
     int chem = scan.nextInt();
     System.out.println("enter your science marks");
     int science = scan.nextInt();



     float percentage =( (physics + maths + english + chem + science)/500.0f)*100;

     System.out.println("percenatge: ");
     System.out.println(percentage);

 }
}
