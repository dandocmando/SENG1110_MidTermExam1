public class q7 {
    public int minimum(int x, int y) {
        int smaller;
        if (x < y) smaller = x;
        else smaller = y;
        return smaller;
    }
    public void run(){
        int z = minimum(5,4);
        System.out.println(z);
    }
    public static void main(String[] args) {
        q7 q = new q7();
        q.run();


    }



}
