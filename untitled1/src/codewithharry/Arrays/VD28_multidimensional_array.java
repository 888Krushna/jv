package codewithharry.Arrays;

public class VD28_multidimensional_array {

    public static void main(String[] args) {
        int []marks; //A 1-D
        int[][] flats;//A 2-D
        flats= new int[2][3];
/*
        flats[][]=101'
    '*/
        //Display the 2-d array (for loop)

        System.out.println("printing a 2-D array using for loop");
        for(int i=0; i<flats.length;i++){
            for(int j=0; j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }


    }
}

