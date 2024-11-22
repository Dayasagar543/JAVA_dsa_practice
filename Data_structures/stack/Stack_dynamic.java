package JAVA_dsa_practice.Data_structures.stack;

public class Stack_dynamic {
    int capacity = 2;
    int[] array = new int[capacity];
    int top = 0;

    public void push(int value) {
        if (size() == capacity) {
            expand();
        }
        array[top] = value;
        top++;

    }

    private void expand() {
        int length = size();
        int newArray[] = new int[capacity * 2];
        for (int i = 0; i <length; i++) {
            newArray[i] = array[i];
        }
        array=newArray;
        capacity*=2;
    }

    public void show() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public int pop() {
        int data = 0;
        if (isempty()) {
            System.out.println("stack is  empty ");

        } else {
            top--;
            data = array[top];
            array[top] = 0;
        }

        return data;
    }

    public int peak() {
        // below code is for n interation we can also use the top to figure out the peak
        // value of stack
        // int i=0;
        // while(array[i]!=0){
        // i++;
        // }
        // System.out.println(array[i-1]);
        int data = 0;
        if (top > 0) {
            data = array[top - 1];
        }
        return data;
    }

    public int size() {
        return top;
    }

    public boolean isempty() {
        return top <= 0 ? true : false;
    }

}
