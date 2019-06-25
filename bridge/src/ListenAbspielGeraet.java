import java.util.ArrayList;

public class ListenAbspielGeraet extends AbspielGeraet {

    private int abspielDatenListeLaenge;

    public ListenAbspielGeraet(Abspieler abspieler, ArrayList<AbspielDaten> abspielDatenListe){
        super(abspieler);
        
        this.abspielDatenListeLaenge = abspielDatenListe.size();
        
        for (int i = 0; i < abspielDatenListe.size(); i++) {
            this.abspieler.leseDaten(abspielDatenListe.get(i));
        }
    }

    @Override
    public void spieleAb() {
        for (int i = 0; i < abspielDatenListeLaenge; i++) {
            this.abspieler.spieleTrack(i + 1);
        }
    }
}
