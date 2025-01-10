//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

import Elementi.Audio;
import Elementi.Immagine;
import Elementi.Video;
import Elementi.ElementoMultimediale;


public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
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

        System.out.println("-----------------------------------------------");
        System.out.println("-----------------yourPlaylist5-----------------");
        System.out.println("-----------------------------------------------");
        ElementoMultimediale[] arrayPlaylist = new ElementoMultimediale[5];
        for (int i=0;i<5;i++){
            System.out.println("Inserisci il tipo di file:");
            System.out.println("1 per un immagine");
            System.out.println("2 per una registrazioen audio");
            System.out.println("3 per un video");
            int type = sn.nextInt();
            sn.nextLine();


            switch(type){
                case 1:

                    System.out.println("inserisci il titolo dell immagine:");
                    String title = sn.nextLine();
                    arrayPlaylist[i]=new Immagine(title);
                    break;
                case 2 :

                    System.out.println("inserisci il titolo della registrazione audio:");
                    String title2 = sn.nextLine();
                    System.out.println("inserisci durata della registrazione video(int):");
                    int durata2 = sn.nextInt();
                    sn.nextLine();
                    arrayPlaylist[i] = new Audio(title2, durata2);
                    break;
                case 3:

                    System.out.println("inserisci il titolo del video:");
                    String title3 = sn.nextLine();
                    System.out.println("inserisci la durata del video(int):");
                    int durata3 = sn.nextInt();
                    sn.nextLine();
                    arrayPlaylist[i]= new Video(title3, durata3);
                    break;
                default:
                    System.out.println("tipo non valido, riprova");
                    i--;

            }



        }
        while(true){
            System.out.println("inserisci un numero per scegliere il file corrisponsente salvato nella playlist: ");
            int numeroFile = sn.nextInt();
            if (numeroFile==0){
                System.out.println("chiusura di yourPlaylist5...");
                break;

            }else if(numeroFile<=5 && numeroFile>=0) {
                arrayPlaylist[numeroFile -1].esegui();

            }else {
                System.out.println("scelta non valida, riprova");
            }
        }





    }
}