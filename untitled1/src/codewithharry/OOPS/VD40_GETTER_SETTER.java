package codewithharry.OOPS;
class MyEmployee{
    int id;
    String name ;

    public String getName(){
        return name;
    }
    public void setName( String n ){
        name= n;
    }

    public void setID(int i){
        id= i;
    }
    public int getId(){
        return id;
    }

}
public class VD40_GETTER_SETTER {
    public static void main(String[] args) {

        MyEmployee krushna = new MyEmployee();
        krushna.setName("hello krushna");
        System.out.println(krushna.getName());
        krushna.setID(01);
        System.out.println(krushna.getId());
    }
}
