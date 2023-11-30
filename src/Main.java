public class Main{
    public static void main(String[] args){
        //luodaan uusi olio
        Kahvinkeitin mocca = new Kahvinkeitin();
        mocca.vari = "Pinkki";
        mocca.merkki = "MoccaMasteri";
    }
}// Main class end here

class Kahvinkeitin{
    String vari;
    String merkki;

    public void PaallePois(boolean on){
        if (on == true){
            System.out.println("Kahvinkeitin on päällä.");
        }
        if (on == false){
            System.out.println("Kahvnikeitin on sammuksi.");
        }
    }

    public void TulostaTiedot(){
        System.out.println("*** Kahvinkeittimen tiedot ***");
        System.out.println("Keittimen väri: " + vari);
        System.out.println("Keittimen merkki: " + merkki);
    }
}
