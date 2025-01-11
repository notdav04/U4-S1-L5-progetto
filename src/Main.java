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

//stampo il template iniziale
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------yourPlaylist5-----------------");
        System.out.println("-----------------------------------------------");

        //creo array che conterra i 5 file
        ElementoMultimediale[] arrayPlaylist = new ElementoMultimediale[5];

        //ciclo for per riempimento dell array
        for (int i=0;i<5;i++){
            System.out.println("Inserisci il tipo di file:");
            System.out.println("1 per un immagine");
            System.out.println("2 per una registrazione audio");
            System.out.println("3 per un video");
            int type = sn.nextInt();
            sn.nextLine();

        //switch per differenziare il tipo del file
            switch(type){
                case 1:
                    System.out.println("inserisci il titolo dell immagine:");
                    String title = sn.nextLine();
                    arrayPlaylist[i]=new Immagine(title);
                    break;

                case 2 :
                    System.out.println("inserisci il titolo della registrazione audio:");
                    String title2 = sn.nextLine();
                    System.out.println("inserisci durata della registrazione audio(int):");
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
        //while per la riproduzione dei file
        while(true) {
            System.out.println("inserisci un numero per scegliere il file corrispondente salvato nella playlist: ");
            int numeroFile = sn.nextInt();
            sn.nextLine();
            if (numeroFile == 0) {
                System.out.println("chiusura di yourPlaylist5...");
                break;

            } else if (numeroFile <= 5 && numeroFile > 0) {
                arrayPlaylist[numeroFile - 1].esegui();
                if (arrayPlaylist[numeroFile - 1] instanceof Immagine) {
                    while (true) {
                        System.out.println("digita ':c' per riprodurre altri file o inserisci comandi per regolare la luminosita");
                        System.out.println("lista comandi luminosita: lum-- / lum++");
                        String command = sn.nextLine();
                        if (command.equals("lum--")) {
                            ((Immagine) arrayPlaylist[numeroFile - 1]).diminuisciLuminosita();
                            arrayPlaylist[numeroFile - 1].esegui();
                        } else if (command.equals("lum++")) {
                            ((Immagine) arrayPlaylist[numeroFile - 1]).aumentaLuminosita();
                            arrayPlaylist[numeroFile - 1].esegui();
                        } else if (command.equals(":c")) {
                            break;
                        }
                    }

                } else if (arrayPlaylist[numeroFile - 1] instanceof Audio) {
                    while(true){
                        System.out.println("digita ':c' per riprodurre altri file o inserisci comandi per regolare il volume");
                        System.out.println("lista comandi volume: vol-- / vol++");
                        String command = sn.nextLine();
                        if (command.equals("vol--")) {
                            ((Audio) arrayPlaylist[numeroFile - 1]).abbassaVolume();
                            arrayPlaylist[numeroFile - 1].esegui();
                        } else if (command.equals("vol++")) {
                            ((Audio) arrayPlaylist[numeroFile - 1]).alzaVolume();
                            arrayPlaylist[numeroFile - 1].esegui();
                        } else if (command.equals(":c")) {
                            break;
                        }
                    }
                } else if (arrayPlaylist[numeroFile - 1] instanceof Video) {
                    while(true){
                        System.out.println("digita ':c' per riprodurre altri file o inserisci comandi per regolare la luminosita e il volume");
                        System.out.println("lista comandi volume: vol-- / vol++");
                        System.out.println("lista comandi luminosita: lum-- / lum++");
                        String command = sn.nextLine();
                        if (command.equals("vol--")) {
                            ((Video) arrayPlaylist[numeroFile - 1]).abbassaVolume();
                            arrayPlaylist[numeroFile - 1].esegui();
                        } else if (command.equals("vol++")) {
                            ((Video) arrayPlaylist[numeroFile - 1]).alzaVolume();
                            arrayPlaylist[numeroFile - 1].esegui();
                        } else if (command.equals(":c")) {
                            break;
                        } else if (command.equals("lum--")) {
                            ((Video) arrayPlaylist[numeroFile - 1]).diminuisciLuminosita();
                            arrayPlaylist[numeroFile - 1].esegui();
                        } else if (command.equals("lum++")) {
                            ((Video) arrayPlaylist[numeroFile - 1]).aumentaLuminosita();
                            arrayPlaylist[numeroFile - 1].esegui();
                        }
                    }
                } else {
                    System.out.println("scelta non valida, riprova");
                }
            }


        }
    }
}

