package step3;

/**
 * Created by Mike Plucker
 * Date: 3/8/2016
 * Class: CSCI 1933-12
 */

/**
 * Lab 6: Step 3: The Sum Total
 */
public class SumTotal {

    //returns the sum of the digits in an integer
    public static int sumDigits(int n){

        n = Math.abs(n);

        //initialize local variable
        int sum = 0;

        //loops while there are still digits
        while(n > 0){
            sum += n % 10; //divides by 10 and adds the remainder to sum
            n /= 10; //"chops off" the right most digit
        }
        return sum;
    }



    //test SumTotal class
    public static void main(String[] args) {

        int digit = 123456, sum;

        sum = SumTotal.sumDigits(digit);

        System.out.println("The sum of the digits in " + digit + " is: " + sum);
    }
}
