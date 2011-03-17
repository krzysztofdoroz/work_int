package queue_on_stacks;

import java.util.Stack;
import static java.lang.System.*;

/**
 *
 * @author krzysztof
 */


class QueueOnStacks{

    Stack<Integer> stackA;
    Stack<Integer> stackB;
    public Stack<Integer> stackMin;
    Stack<Integer> stackD;

    int currentMin = Integer.MAX_VALUE;

    public QueueOnStacks(){
        stackA = new Stack<Integer>();
        stackB = new Stack<Integer>();
        stackMin = new Stack<Integer>();
        stackD = new Stack<Integer>();
    }

    public int getMin(){

        if (!stackA.isEmpty()){
            while(!stackA.isEmpty()){
                int elem = stackA.peek();
                stackB.push(stackA.pop());
                if (elem < currentMin){
                    currentMin = elem;
                }
                stackMin.push(currentMin);
            }
        }

        return stackMin.peek();
    }

    public int dequeu(){
        if(stackB.size() == 0){
            while(!stackA.empty()){
                int elem = stackA.peek();
                stackB.push(stackA.pop());
                if (elem < currentMin){
                    currentMin = elem;
                }
                stackMin.push(currentMin);
            }
        }
        stackMin.pop();
        return stackB.pop();
    }

    public void equeue(int elem){
        stackA.push(elem);
    }
    
}


public class QueueOnStackMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QueueOnStacks queue = new QueueOnStacks();

        queue.equeue(1);
        queue.equeue(0);
        queue.equeue(2);
        
        queue.equeue(3);
        queue.equeue(4);
        
       

        out.println("wyciagamy z kolejki:" + queue.dequeu() + " MIN:" + queue.getMin() );
        //out.println(queue.stackMin.size());

        for (Integer min : queue.stackMin ){
        //    out.println(min);
        }

       
         out.println("wyciagamy z kolejki:" + queue.dequeu() + " MIN:" + queue.getMin());
        out.println("wyciagamy z kolejki:" + queue.dequeu() + " MIN:" + queue.getMin());

    }

}
