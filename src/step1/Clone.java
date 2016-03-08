package step1;

import java.util.Arrays;

/**
 * Created by Mike Plucker
 * Date: 3/1/2016
 * Class: CSCI 1933-12
 */

/**
 * Lab 6: Step 1: Making an Array Duplicate by Cloning
 */
public class Clone {

    //returns an identical but separate "clone" of a 1-dimensional array of ints passed to it
    public static int[] clone(int [] a){

        int [] clone = new int [a.length];
        for(int i = 0; i < a.length; i++){
            clone[i] = a[i];
        }
        return clone;

        //return a.clone();
    }



    //tests Clone class
    public static void main(String[] args) {

        int [] a = {1, 2, 3, 4, 5};
        int [] b;
        int [] c;


        b = Clone.clone(a); //clones array a to b

        System.out.println("Array a = " + Arrays.toString(a)); //print array a
        System.out.println("Array b = " + Arrays.toString(b)); //print array b


        //test if array a is the same as array b
        if(Arrays.equals(a, b)){
            System.out.println("\nArray a and b are equal.");
        }
        else{
            System.out.println("\nArray a and b are not equal.");
        }


        b[0] = 5; //change an element in array b
        System.out.println("\nArray a = " + Arrays.toString(a)); //print array a
        System.out.println("Array b = " + Arrays.toString(b)); //print array b


        //test if array a is the same as array b
        if(Arrays.equals(a, b)){
            System.out.println("\nArray a and b are equal.");
        }
        else{
            System.out.println("\nArray a and b are not equal.");
        }


        c = Clone.clone(b);
        System.out.println("\nArray b = " + Arrays.toString(b)); //print array b
        System.out.println("Array c = " + Arrays.toString(c)); //print array c


        //test if array b is the same as array c
        if(Arrays.equals(b, c)){
            System.out.println("\nArray b and c are equal.");
        }
        else{
            System.out.println("\nArray b and c are not equal.");
        }
    }
}
