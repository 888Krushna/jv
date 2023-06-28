package codewithharry.OOPS;


class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }

    public void setName(String n){
        name=n;
    }
}

class cellphone{
    public void ring(){
        System.out.println("phone is rining");
    }
    public void vibrating(){
        System.out.println(" phone is vibrating");
    }
    public void calling(){
        System.out.println("calling krushna  ");
    }
}


class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class pubg{
    public void hit(){
        System.out.println(" hitting a enemy");
    }
    public void run(){
        System.out.println("running a enemy");
    }
    public void fall(){
        System.out.println(" falling a enemy");
    }
}


public class VD39_OOPS_PRARICE_{

    public static void main(String[]args){
     /*
        ////problem number 1
        Employee1 krushna = new Employee1();
        krushna.setName("hello krushna");
        krushna.salary=1000000;
        System.out.println(krushna.getSalary());
        System.out.println(krushna.getName());


        //problem 2

        cellphone iphone = new cellphone();
        iphone.calling();;
        iphone.ring();
        iphone.vibrating();

        //problem number 3
        square rigon = new square();
        rigon.side=5;
        System.out.println(rigon.area());
        System.out.println(rigon.perimeter());

      */

        //problem number 5
           pubg player1 = new pubg();
           player1.hit();
           player1.run();
           player1.fall();




    }
}
