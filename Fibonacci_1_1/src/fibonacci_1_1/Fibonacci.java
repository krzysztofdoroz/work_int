/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fibonacci_1_1;

/**
 *
 * @author krzysztof
 */
public class Fibonacci {


    private static int fib(int n){

        if (n == 0 || n == 1)
            return 1;
        else {
            
        }


        return fib(n-1) + fib(n-2);

    }



    public static void main(String[] args) {

        System.out.println("fib(2):" + fib(2));
        System.out.println("fib(3):" + fib(3));
        System.out.println("fib(4):" + fib(4));
        System.out.println("fib(4):" + fib(4000));

    }

}
