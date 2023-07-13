package Java_8_Featurs;
interface Interf {

    public void add(int a, int  b);
}
/*class addtion {

    public  int add(int a,int b){

        return a+b;
    }

}*/


public class LambaExpresion {

    public static void main(String[] args) {

        Interf adition =    (int a, int b) -> System.out.println(a+b);

        adition.add(10,30);


    }
}
