package Java_8_Featurs;

interface Sq{

    public int square(int n);

}

public class LambdaPractise {

    public  static  void main(String [] args){

        Sq i = n-> n*n;

        i.square(20);

    }
}
