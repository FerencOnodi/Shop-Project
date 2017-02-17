import java.util.Date;

/**
 * Created by ferenc on 2017.02.17..
 */
public abstract class TejFactory {

    public Tej ujTartosTej(Long vonalkod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom, long ar){
        return new TartosTej;
    }

    public Tej ujFeltartosTej(Long vonalkod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom, long ar) {
        return new FeltartosTej;
    }
}
