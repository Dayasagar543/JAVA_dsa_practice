package JAVA_dsa_practice.Data_structures.stack;

public class Main {
    public static void main(String[] args) {

        // static stack
        Stack_static st=new Stack_static();
        st.push(5);
        st.show();
        st.push(9);
        st.show();
        st.push(6);
        st.show();
        st.push(1);
        st.show();
        st.push(2);
        st.show();
        st.push(10);
        st.show();
        System.out.println("printing the value that is poped  "+st.pop());
        System.out.println("printing after the pop");
        st.show();
        System.out.println("printing the peak value ");
        System.out.println(st.peak());
        // st.pop();
        // st.pop();
        // st.pop();
        // st.pop();
        // st.pop();
        System.out.println("printing the peak value ");
        System.out.println(st.peak());
        System.out.println("the size of stack is "+st.size());
        System.out.println("is the stack empty "+st.isempty());

        Stack_dynamic ds=new Stack_dynamic();
        System.out.println();
        System.out.println("printing the dynamic stack");
        ds.push(5);
        ds.show();
        ds.push(9);
        ds.show();
        ds.push(6);
        ds.show();
        ds.push(1);
        ds.show();
        ds.push(2);
        ds.show();
        ds.push(10);
        ds.show();
        ds.push(60);
        ds.show();
        ds.push(80);
        ds.show();
        ds.push(10);
        ds.show();
        ds.push(60);
        ds.show();
        ds.push(80);
        ds.show();
        ds.push(10);
        ds.show();
        ds.push(60);
        ds.show();
        ds.push(80);
        ds.show();
        ds.pop();
        ds.pop();
        ds.pop();
        ds.pop();
        ds.pop();
        ds.show();
    }
    
}
