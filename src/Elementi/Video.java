package Elementi;

public class Video extends ElementoMultimediale implements Luminosita, Riproducibile {
    private int  volume;
    private int  luminosita;
    private int durata;
    public Video(String titolo, int durata){
        super(titolo);
        volume = 3;
        luminosita = 3;
        this.durata= durata;
    }

    @Override
    public void aumentaLuminosita(){
        if(luminosita ==5){
            System.out.println("Luminosita al massimo, impossibile aumentare");
        }else{
            luminosita++;}
    }
    public void diminuisciLuminosita(){
        if(luminosita ==0){
            System.out.println("Luminosita al minimo, impossibile diminuire");
        }else{
            luminosita--;}
    }
    public void alzaVolume(){
        if (volume ==5){
            System.out.println("impossibile aumentare, volume massimo raggiunto");
        }else {
            volume ++;
        }
    }
    public void abbassaVolume (){
        if (volume ==0){
            System.out.println("impossibile abbassare, volume minimo raggiunto");

        }else {
            volume --;
        }
    }

    public void play(){
        if (durata >0){
            for (int i =0; i<durata;i++){
                System.out.println(titolo + " " + "!".repeat(volume) + " "+ "*".repeat(luminosita));
            }
        }
    }

    @Override
    public void esegui() {
        play();
        System.out.println("-------------------------------");
    }
}
