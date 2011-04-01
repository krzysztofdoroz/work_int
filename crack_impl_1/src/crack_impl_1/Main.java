package crack_impl_1;

/**
 *
 * @author krzysztof
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (int i = 0 ; i < 10; i++){
            for(int j = 0; j < 2; j++){
                System.out.println(add(i, j));
            }
        }
    }

    public static int add(int a, int b){
        int sum = a ^ b;
        int carry = (a & b) << 1;

        while(carry != 0){
            int s = sum;
            sum = sum ^ carry;
            carry = (s & carry) << 1;
        }

        return sum;
    }

}
