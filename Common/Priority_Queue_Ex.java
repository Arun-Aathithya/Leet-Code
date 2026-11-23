import java.util.Comparator;
import java.util.PriorityQueue;

public class Priority_Queue_Ex {
    public static void main(String[] args){
        PriorityQueue <Integer> pq=new PriorityQueue<>();
        PriorityQueue <Integer> pqmax=new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(25);
        pq.offer(19);
        pq.offer(69);
        pqmax.add(36);
        pqmax.add(33);
        pqmax.add(390);
        System.out.println("Priority Queue:"+pq.size());
        System.out.println("Priority Queue:"+pq);
        System.out.println("Peek:"+pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pqmax);
    }
}
