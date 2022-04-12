import java.util.Scanner;

public class q8 {
    public void run()
    {
        int s;
        int i;
        int j;
        int n=3;
        for(s=0, i=1, j=2; i+j<n; i++, j+=2){
            s+=(i*j);

        }
        System.out.println(j);


    }
    public static void main(String[] args){
       q8 q = new q8();
       q.run();

    }
}
