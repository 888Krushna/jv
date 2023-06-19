package codewithharry.METHODS;

public class VD30_METHODS {
   static   int logic( int c , int d){
        int e;
        if(c>d){
            e=c+d;

        }
        else {
            e=(c+d)*10;
        }
        return e;
    }

    public static void main(String[] args) {
        int a=4;
        int b= 99;
         int c;
    c=logic(a,b);

       int a1= 50;
       int b1= 40;
       int c1;
       c1= logic(a1,b1);

        System.out.println(c);
        System.out.println(c1);

        System.out.println("final result");

    }



}
