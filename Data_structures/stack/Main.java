package JAVA_dsa_practice.Data_structures.stack;

public class Main {
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(5);
        st.push(9);
        st.push(6);
        st.push(1);
        st.push(2);
        // st.push(10);
        st.show();
        System.out.println("printing the value that is poped  "+st.pop());
        System.out.println("printing after the pop");
        st.show();
        System.out.println("printing the peak value ");
        System.out.println(st.peak());
        st.pop();
        System.out.println("printing the peak value ");
        System.out.println(st.peak());
        System.out.println("the size of stack is "+st.size());
    }
    
}
