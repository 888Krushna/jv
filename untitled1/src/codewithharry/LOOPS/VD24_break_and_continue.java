package codewithharry.LOOPS;
public class VD24_break_and_continue {
    public static void main(String[] args) {
        //using for loop  [break statement]
        for(int i=10;i>0;i--){
            if(i==7){ //break the loop
            }
            System.out.println(i);
        }


         Break and continue using loops!for (int i=0;i<50;i++){
           System.out.println(i);
           System.out.println("Java is great");
            if(i==2){
               System.out.println("Ending the loop");
               break;
          }
       }
       int i=0;
       do{
           System.out.println(i);
            System.out.println("Java is great");
            if(i==2){
               System.out.println("Ending the loop");
               break;
           }
            i++;
        }while(i<5);
       System.out.println("Loop ends here");


            for(int i=0;i<50;i++){
            if(i==2){
                System.out.println("Ending the loop");
                continue;
            }
                System.out.println(i);
               System.out.println("Java is great");
     continue;
            }
            System.out.println(i);
            System.out.println("Java is great");

        }while(i<5);
        System.out.println("Loop ends here");
    }
}



