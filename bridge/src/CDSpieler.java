import java.util.ArrayList;

public class CDSpieler implements Abspieler {

    private ArrayList<AbspielDaten> abspielDatenListe;

    public CDSpieler(){
        this.abspielDatenListe = new ArrayList<>();
    }

    public void spieleTrack(int trackZahl){
            System.out.println(this.getClass().getSimpleName() + " spiele Track " + trackZahl + " ab:" + abspielDatenListe.get(trackZahl - 1).toString());
    }

    public void leseDaten(AbspielDaten daten){

        abspielDatenListe.add(daten);

        System.out.println(this.getClass().getSimpleName() + " Daten von " + daten.toString() + " eingelesen.");


    }

    public void ausschalten(){
    	this.abspielDatenListe = null;
        System.out.println(this.getClass().getSimpleName() + " ausgeschaltet.");
    }
}
