import java.util.Date;
/**
 * Created by ferenc on 2017.02.14..
 */
public abstract class Tej {

    public final int LITER = 4;
    public final int FELLITER = 2;
    public final int POHAR = 1;
    public final double ZSIROS = 0.5;
    public final double FELZSIROS = 0.25;

    protected Long vonalKod;
    protected int urtartalom;
    protected String gyarto;
    protected Date szavatossagiIdo;
    protected  double zsirtartalom;

    public Tej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom) {
        this.vonalKod = vonalKod;
        this.gyarto = gyarto;
        this.szavatossagiIdo = szavatossagiIdo;
        this.urtartalom = urtartalom;
        this.zsirtartalom = zsirtartalom;
    }

    public long getVonalKod() {
        return vonalKod;
    }

    public boolean joMeg() {
        Date today = new Date();
        return today.before(szavatossagiIdo);
    }

    public int getUrtartalom() {
        return urtartalom;
    }

    public String getGyarto() {
        return gyarto;
    }

    public Date getSzavatossagiIdo() {
        return szavatossagiIdo;
    }

    public double getZsirtartalom() {
        return zsirtartalom;
    }

    public String toString() {
        return "" + getGyarto() + getUrtartalom() + getSzavatossagiIdo() + getZsirtartalom();
    }
}