package hanoi;

/**
 *
 * @author krzysztof
 */
public class Hanoi {

    
    public static void main(String[] args) {
        hanoi("A", "C", "B", 3);
    }

    public static void hanoi(String source, String dest,String aux ,int numberOfDisks){
        
        if(numberOfDisks == 0){
            return;
        } else if(numberOfDisks == 1){
            System.out.println("moving disk from:" + source + " to:" + dest);
            return;
        }

        hanoi(source, aux, dest, numberOfDisks - 1);
        hanoi(source, dest, aux, 1);
        hanoi(aux, dest, source, numberOfDisks - 1);
    }

}
