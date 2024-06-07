package JAVA_dsa_practice.basics;

public class Unary_operator {
    public static void main(String[] args) {
        int p=10,q;
        q=p;
        //unary plus(+)
        System.out.println(p+q);

        //unary minus(-)
        System.out.println(p-q);

        //increment operator(++)
        System.out.println(p++);//10
        System.out.println(++p);//12

        //decrement operator(--)
        System.out.println(p--);//12
        System.out.println(--p);//10

        //logical complement operator
        System.out.println(!(p==q));//false
    }
}
