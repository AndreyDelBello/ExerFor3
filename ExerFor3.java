import java.lang.ref.Cleaner;

public class ExerFor3 {
    public static void main(String[]args){
        for(int n=1;n<=100;n++){
            if(n%3==0){
                System.out.print(" "+n);
            }
        }
    }
}
