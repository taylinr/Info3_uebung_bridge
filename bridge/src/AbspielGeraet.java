public class AbspielGeraet {

    public Abspieler abspieler;

    public AbspielGeraet(Abspieler abspieler){
        this.abspieler = abspieler;
    }

    public void spieleAb(){
        String daten = abspieler.leseDaten();

        System.out.println(daten);
    }

}
