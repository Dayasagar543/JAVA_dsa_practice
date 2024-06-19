package JAVA_dsa_practice.Function;

public class Arthematic {
    int a, b;

    // default constructor
    public Arthematic() {
        System.out.println("From add");
    }

    // parameterised constructor
    public Arthematic(int a, int b) {
        System.out.println(a + " " + b);
        this.a = a;
        this.b = b;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a/b ;
    }
    public int mod(int a, int b) {
        return a % b;
    }
}
