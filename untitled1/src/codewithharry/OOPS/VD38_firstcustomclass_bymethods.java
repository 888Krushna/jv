package codewithharry.OOPS;
 class Employee{
     int id;
     int salary;
     String name;

     public void printdetails(){
         System.out.println("my id is" + id);
         System.out.println("and my is" + name);
     }
     public int getSalary(){
         return salary;
     }


 }
public class VD38_firstcustomclass_bymethods {
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        Employee harry = new Employee();// instanting a new Employee object.
        Employee ravi = new Employee();// instanting a new Employee object.

        //setting attributes for haryy.

        harry.id= 30;
        harry.name= "codewitharry";
        harry.salary=12000;

        //setting attributes for ravi.
        ravi.id=40;
        ravi.name="ravipawar";
        ravi.salary=20000;

        // printing attributes.
        harry.printdetails();;

        ravi.printdetails();;
        int salary =ravi.getSalary();
        System.out.println(salary);
    }

}
