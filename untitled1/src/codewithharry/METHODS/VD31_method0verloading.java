package codewithharry.METHODS;

public class VD31_method0verloading {


        static void foo(){
            System.out.println("Good Morning bro!");
        }

        static void foo ( int a){
            System.out.println("Good morning " + a + " bro!");
        }

        static void foo ( int a, int b){
            System.out.println("Good morning " + a + " bro!");
            System.out.println("Good morning " + b + " bro!");
        }

        static void foo ( int a, int b, int c){
            System.out.println("Good morning " + a + " bro!");
            System.out.println("Good morning " + b + " bro!");
            System.out.println("Good morning " + c + " bro!");
        }



        public static void main (String[]args){
            // tellJoke();

            // Case 1: Changing the Integer
            //int x = 45;
            //change(x);
            //System.out.println("The value of x after running change is: " + x);

            // Case 1: Changing the Array
            // int [] marks = {52, 73, 77, 89, 98, 94};
            // change2(marks);
            // System.out.println("The value of x after running change is: " + marks[0]);


            // Method Overloading
            foo();
            foo(3000);
            foo(5000, 4000);
            foo(33,66,666);
            // Arguments are actual!
        }


    }


