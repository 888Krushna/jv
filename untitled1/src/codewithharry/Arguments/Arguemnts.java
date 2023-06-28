package codewithharry.Arguments;

public class Arguemnts {

        static int sum(int x , int ...arr){
            // int x stands for we x valuse without x we can not slove
           int result=x;
            for (int a: arr){
                result+=a;
            }
            return result;
        }


    public static void main(String[] args) {
        System.out.println("welcome to varagrs");
        System.out.println("the sum of 4 and 5 is "+ sum(4,5));
    }
}
