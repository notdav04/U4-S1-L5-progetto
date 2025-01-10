package Elementi;

public class Audio extends ElementoMultimediale implements Riproducibile{
    private int volume;
    private int durata;


    public Audio(String titolo, int durata){
        super(titolo);
        volume = 3;
        this.durata = durata;
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
                System.out.println(titolo + " " + "!".repeat(volume));
            }
        }

    }
    public void esegui(){
        play();
    }

}
