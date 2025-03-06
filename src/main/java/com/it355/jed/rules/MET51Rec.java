package com.it355.jed.rules;
import java.util.Queue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
//Recommendation MET51-J: Do not use overloaded methoods to differentiate between runtime types
public class MET51Rec {
    //use instanceof to differentiate
    /**
     * display method to differentiate between different queues
     * @param queue
     * @return
     */
    private static String display(Queue<?> queue)
    {
        if(queue instanceof BlockingDeque)
            return "blockingdeque";
        else if (queue instanceof BlockingQueue)
            return "BlockingQueue";
        else
            return "Not recognized";
    }

    public static void main(String[] args) {

        //Different types of queues
        BlockingDeque<?> queue1 = new LinkedBlockingDeque<>();
        BlockingQueue<?> queue2 = new LinkedBlockingQueue<>();
        System.out.println(display(queue1));
        System.out.println(display(queue2));
        
    }
}
