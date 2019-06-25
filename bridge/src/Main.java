import java.util.ArrayList;

public class Main {
    public static void main(String[]args){
        ArrayList<AbspielDaten> abspielListe = new ArrayList<>();
        AbspielDaten track1 = new AbspielDaten("Fugees - Fu-Gee-La");
        AbspielDaten track2 = new AbspielDaten("Toto - Africa");
        AbspielDaten track3 = new AbspielDaten("Bonnie Tyler - Total Eclipse of the Heart");
        AbspielDaten track4 = new AbspielDaten("Rihanna - Diamonds");
        AbspielDaten track5 = new AbspielDaten("Tarkan - Dudu");

        abspielListe.add(track1);
        abspielListe.add(track2);
        abspielListe.add(track3);
        abspielListe.add(track4);
        abspielListe.add(track5);

        CDSpieler cdSpieler = new CDSpieler();
        CDSpieler cdSpieler2 = new CDSpieler();
        KasettenSpieler kasettenSpieler = new KasettenSpieler();

        cdSpieler.leseDaten(track1);
        cdSpieler.leseDaten(track2);
        cdSpieler.leseDaten(track3);
        

        kasettenSpieler.leseDaten(track1);
        kasettenSpieler.leseDaten(track2);
        kasettenSpieler.leseDaten(track3);
        kasettenSpieler.leseDaten(track4);
        kasettenSpieler.leseDaten(track5);


        ListenAbspielGeraet listenAbspieler = new ListenAbspielGeraet(cdSpieler2, abspielListe);

        cdSpieler.spieleTrack(3);
        
        
        kasettenSpieler.spieleTrack(5);
        
        
        listenAbspieler.spieleAb();
        
        cdSpieler.ausschalten();
        cdSpieler2.ausschalten();
        kasettenSpieler.ausschalten();

    }
}
