package bolt.aruk;

import bolt.Aru;

/**
 * Created by ferenc on 2017.02.18..
 */
public class Szappan extends Aru {

    Long vonalKod;
    String gyarto;
    char mosohatas;

    public Szappan(Long vonalKod, String gyarto, char mosohatas) {
        this.vonalKod = vonalKod;
        this.gyarto = gyarto;
        this.mosohatas = mosohatas;
    }
}
