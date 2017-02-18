package bolt;

import bolt.aruk.Sajt;
import bolt.aruk.Szappan;
import bolt.aruk.tej.FeltartosTej;
import bolt.aruk.tej.TartosTej;
import bolt.aruk.Tej;

import java.util.Date;

/**
 * Created by ferenc on 2017.02.17..
 */
public abstract class BoltFactory {

    public Tej ujTartosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom){
        return new TartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, zsirtartalom);
    }

    public Tej ujFeltartosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom) {
        return new FeltartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, zsirtartalom);
    }

    public Sajt ujSajt(double suly, double zsirtartalom, Long vonalKod, String gyarto, Date szavatossagiIdo) {
        return new Sajt(suly, zsirtartalom, vonalKod, gyarto, szavatossagiIdo);
    }

    public Szappan ujSzappan(Long vonalKod, String gyarto, char mosohatas) {
        return new Szappan(vonalKod, gyarto, mosohatas);
    }
}
