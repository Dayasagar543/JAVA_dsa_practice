package JAVA_dsa_practice.basics;

public class Logical_operators {
    public static void main(String[] args) {
        int p=10,q=15,r=5;
        // && operator
        System.out.println((p<q)&&(r<p));//true
        System.out.println((p>q)&&(r<p));//false

        // || operator
        System.out.println(r<q||p>q);//true;
        System.out.println(r>q||r>p);//false;
        

        //!
        System.out.println(!(p==q));//true
    }
}
