package JAVA_dsa_practice.Data_structures.queue.queue_static;

public class Main {
    public static void main(String[] args) {
        Queue_static qs = new Queue_static();
        qs.enqueue(6);
        qs.enqueue(65);
        qs.enqueue(5);
        qs.enqueue(677);
        qs.enqueue(77);
        qs.enqueue(8);
        qs.show();
        System.out.println("The returned element "+qs.dequeue());
        qs.show();
    }
}
