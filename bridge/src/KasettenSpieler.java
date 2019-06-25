import java.util.ArrayList;

public class KasettenSpieler implements Abspieler {

    private ArrayList<AbspielDaten> abspielDatenListe;

    public KasettenSpieler(){
        this.abspielDatenListe = new ArrayList<>();
    }

    public void spieleTrack(int trackZahl){
        for (int i = 0; i < trackZahl; i++) {
            if( i < (trackZahl - 1) ){
                System.out.println(this.getClass().getSimpleName() + " überspringe Track: " + (i + 1) + " " + this.abspielDatenListe.get(i).toString());
            } else{
                System.out.println(this.getClass().getSimpleName() + " spiele Track " + trackZahl + " ab: " + this.abspielDatenListe.get(trackZahl - 1).toString());
            }
        }
    }

    public void leseDaten(AbspielDaten daten){
        this.abspielDatenListe.add(daten);
        System.out.println(this.getClass().getSimpleName() + " Daten von " + daten.toString() + " eingelesen.");
    }

    public void ausschalten(){
    	this.abspielDatenListe = null;
        System.out.println(this.getClass().getSimpleName() + " ausgeschaltet.");
    }


}
