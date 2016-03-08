package step2;

/**
 * Created by Mike Plucker
 * Date: 3/8/2016
 * Class: CSCI 1933-12
 */

/**
 * Lab 6: Step 2: Building an Array to Order
 */
public class ArrayToOrder {

    private static final int ROW = 4, COLUMN = 3;
    //private static double [][] first;


    //returns an array of dimension row X column of doubles
    public static double[][] make2DArray(int row, int column){

        double[][] array = new double[row][column];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                array[i][j] = i + j;
            }
        }
        return array;
        //return new double[row][column];
    }



    //tests ArrayToOrder class
    public static void main(String[] args) {

        double [][] array = ArrayToOrder.make2DArray(ROW, COLUMN); //create new 2D array
        int num = 0;


        //print header for columns
        System.out.print("col: ");
        for(int header = 0; header < array[0].length; header++){
            System.out.print("\t" + (header));
        }

        System.out.println("\n"); //spacer

        //print 2D array
        for(int i = 0; i < array.length; i++){
            System.out.print("row " + (i) + ":"); //prints out row numbers


            for(int j = 0; j < array[i].length; j++){
                System.out.print("\t" + (j + num)); //prints out numbers in matrix 1 row at a time
            }
            num++; //increment so that each row starts at index, but goes up by 1 for each column
            System.out.println();
        }
    }
}
