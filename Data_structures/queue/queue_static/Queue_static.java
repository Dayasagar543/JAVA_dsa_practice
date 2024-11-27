package JAVA_dsa_practice.Data_structures.queue.queue_static;

public class Queue_static {
    int[] array = new int[5];
    int front = 0, rear = 0, size = 0;

    public void enqueue(int data) {
        array[rear] = data;
        rear=(rear+1)%5;
        size++;
    }

    public int dequeue() {
        int data = array[front];
        array[front] = 0;
        front=(front+1)%5;
        size--;
        // for (int i = 1; i < array.length; i++) {
        //     array[i-1]=array[i];
        // }
        return data;
    }

    public void show() {
        System.out.print("elements are   ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[(front+i)%5] + " ");
        }
        System.out.println();
    }

}
