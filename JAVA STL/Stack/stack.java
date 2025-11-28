import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class stack {
    public static void main(String[] args){

        Stack<String> students = new Stack<>();     

        students.push("Aish");
        students.push("Swinal");
        students.push("Rehan");
        students.push("Harshal");
        students.push("Rupesh");
        students.pop();

        System.out.println(students);


        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(10);
        pq.add(40);
        pq.add(10);
        pq.add(20);
        pq.add(20);
        pq.add(30);

        System.out.println(pq);


    }
}
