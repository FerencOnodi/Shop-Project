package bolt;

import bolt.aruk.tej.FeltartosTej;
import bolt.aruk.tej.TartosTej;
import bolt.aruk.Tej;

import java.util.Date;

/**
 * Created by ferenc on 2017.02.17..
 */
public abstract class TejFactory {

    public Tej ujTartosTej(Long vonalkod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom){
        return new TartosTej(vonalkod, urtartalom, gyarto, szavatossagiIdo, zsirtartalom);
    }

    public Tej ujFeltartosTej(Long vonalkod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom) {
        return new FeltartosTej(vonalkod, urtartalom, gyarto, szavatossagiIdo, zsirtartalom);
    }
}
