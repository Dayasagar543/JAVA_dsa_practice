package JAVA_dsa_practice.Loops.for_loop;

public class Multiples_3 {
    public static void main(String[] args) {
        for(int i=1;i<=50;i++){
            if(i%3==0){
               continue;
            }else{
                System.out.println(i);
            }
        }
    }
    
}
