package Elementi;

public class Immagine extends ElementoMultimediale implements Luminosita{
    private int luminosita;
    public Immagine(String titolo){
        super(titolo);
        luminosita=3;
    }
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
    public void show(){
        System.out.println(titolo + " " +"*".repeat(luminosita));
    }
    public void esegui(){
        show();
    }
}
