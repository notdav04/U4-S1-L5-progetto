//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import Elementi.Audio;
import Elementi.Immagine;
import Elementi.Video;


public class Main {
    public static void main(String[] args) {
    Immagine img1 = new Immagine("meme1");
//    img1.esegui();
        Audio track1 = new Audio("nota vocale", 5);
//        track1.esegui();
        track1.abbassaVolume();
//        track1.esegui();
        Video vid1 = new Video("lezione 1", 20);

        vid1.esegui();
        vid1.abbassaVolume();
        vid1.aumentaLuminosita();
        vid1.esegui();


    }
}