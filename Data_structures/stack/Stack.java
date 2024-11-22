package JAVA_dsa_practice.Data_structures.stack;

public class Stack {
    int[] array = new int[5];
    int top = 0;

    public void push(int value) {
        if (top < array.length) {
            array[top] = value;
            top++;
        } else {
            System.out.println("ran out of stack indexes");
        }

    }

    public void show() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public int pop() {
        int data = 0;
        if (top > 0) {
            top--;
            data = array[top];
            array[top] = 0;
        } else {
            System.out.println("stack is already empty ");
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
        int data;
        data = array[top - 1];
        return data;
    }

    public int size() {
        return top;
    }

    public boolean isempty(){
return
    }
}
