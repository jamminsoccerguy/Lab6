package step4;

/**
 * Created by Mike Plucker
 * Date: 3/8/2016
 * Class: CSCI 1933-12
 */

/**
 * Lab 6: Step 4: In a Class by Itself
 */
public class Polynomial {

    //instance variables
    private double a, b, c;


    //constructor
    public Polynomial(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }


    //getters
    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }

    public double getC(){
        return c;
    }


    //returns p + this polynomial
    public Polynomial add(Polynomial p){

        a += p.getA();
        b += p.getB();
        c += p.getC();


        return this;
        //return new Polynomial(p.getA() + getA(), p.getB() + getB(), p.getC() + getC());
    }


    //returns the value of this polynomial at x
    public double evaluate(double x){
        return a * x * x + x * b + c;
        //return (getA() * Math.pow(x, 2)) + (getB() * x) + getC();
    }


    //toString method
    public String toString(){
        return "(" + getA() + ", " + getB() + ", " + getC() + ")";
    }


    //test Polynomial class
    public static void main(String[] args) {

        //polynomial objects
        Polynomial one = new Polynomial(1, 2, 3);
        Polynomial two = new Polynomial(2, 3, 4);
        Polynomial zero = new Polynomial(0, 0, 0);
        Polynomial zero2 = new Polynomial(2, 0, 3);
        Polynomial three, four, five;

        //local variable
        double x = 10;


        //test add() method
        three = one.add(two);
        System.out.println("Poly one + poly two = " + three.toString());

        four = two.add(zero);
        System.out.println("Poly two + poly zero = " + four.toString());

        five = zero.add(zero2);
        System.out.println("Poly zero + poly zero2 = " + five.toString());


        System.out.println();


        //test evaluate() method
        System.out.println("The Value of the First Polynomial " + one.toString() + ", if x = " + x + " is: " + one.evaluate(x));
        System.out.println("The Value of the Second Polynomial " + two.toString() + ", if x = " + x + " is: " + two.evaluate(x));
    }
}
