import java.util.Scanner;

public class Playlist {
    public void run()
    {
        Song p = new Song();
        p.setLength(300);
        System.out.println(p.getLength());


    }
    public static void main(String[] args){
        Playlist playlist = new Playlist();
        playlist.run();

    }
}
