import java.util.Arrays;
/**
 * Created by ferenc on 2017.02.14..
 */
public class Bolt {

    private String nev;
    private String cim;
    private String tulajdonos;
    private Tej[] tejpult;
    private int flag;

    public Bolt(String nev, String cim, String tulajdonos, Tej[] tejpult) {
        this.nev = nev;
        this.cim = cim;
        this.tulajdonos = tulajdonos;
        this.tejpult = tejpult;
    }

    public String getNev() {
        return nev;
    }

    public String getCim() {
        return cim;
    }

    public String getTulajdonos() {
        return tulajdonos;
    }

    public boolean vanMegTej() {
        return tejpult.length > 0;
    }

    public Tej vasarolTej(Tej m) {
        for (Tej tej : tejpult) {
            if(tej.equals(m)){
                Arrays.asList(tejpult).remove(tej);
                return tej;
            }
        }
        return null;
    }
}
