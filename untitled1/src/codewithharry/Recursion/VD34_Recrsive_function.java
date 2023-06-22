package codewithharry.Recursion;

public class VD34_Recrsive_function {
    //factorial(0)=1
    //factorial(n) = n * n-1 * .....1
    //factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
    //factorial(n) = n * factorial(n-1)

  /*  static int factorial(int n){
        if(n==0  || n==1){
            return 1;
        }
        else{
            return n * factorial( n-1);
        }
    }

    public static void main(String[] args) {
        int x=4;
        System.out.println("the vlaue of factorial x is :" + factorial(x));
    }

   */


    //the example of recursion in recursion method run continously. out will infinite
  /*  static void xyz(){
        System.out.println("good morning");
        xyz();
    }

    public static void main(String[] args) {
        xyz();
    }
*/

    // the example finite out put
    static int count=0;
    static void x(){
        count++;
        if(count<=10){
            System.out.println("below 11: "+count);
            x();
        }
    }
    public static void main(String[] args) {
        x();
    }

}
