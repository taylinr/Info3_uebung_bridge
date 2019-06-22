public class CDSpieler implements Abspieler {

    private AbspielDaten daten;

    public CDSpieler(AbspielDaten daten){
        this.daten = daten;
    }

    public void spieleTrack(){
        System.out.println(leseDaten());
    }

    public String leseDaten(){
        String datenString = daten.toString();
        return datenString;
    }

    public void ausschalten(){
        System.out.println("ausgeschaltet.");
    }
}
