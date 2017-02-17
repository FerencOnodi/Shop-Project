import java.util.Date;

/**
 * Created by ferenc on 2017.02.17..
 */
public abstract class Elelmiszer {

    protected Long vonalKod;
    protected String gyarto;
    protected Date szavatossagiIdo;

    public Elelmiszer(Long vonalKod, String gyarto, Date szavatossagiIdo) {
        this.vonalKod = vonalKod;
        this.gyarto = gyarto;
        this.szavatossagiIdo = szavatossagiIdo;
    }

    public Long getVonalKod() {
        return vonalKod;
    }

    public String getGyarto() {
        return gyarto;
    }

    public Date getSzavatossagiIdo() {
        return szavatossagiIdo;
    }

    public boolean joMeg() {
        Date today = new Date();
        return today.before(szavatossagiIdo);
    }

    public String toString() {
        return "" + getGyarto() + getVonalKod() + getSzavatossagiIdo();
    }
}
