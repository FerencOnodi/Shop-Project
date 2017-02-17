import org.omg.CORBA.PRIVATE_MEMBER;

import java.util.Date;
/**
 * Created by ferenc on 2017.02.14..
 */
public class Tej {

    private long vonalKod;
    private final int LITER = 4;
    private final int FELLITER = 2;
    private final int POHAR = 1;
    private final double ZSIROS = 0.5;
    private final double FELZSIROS = 0.25;

    private int urtartalom;
    private String gyarto;
    private Date szavatossagiIdo;
    private  double zsirtartalom;
    private long ar;

    public Tej(long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom, long ar) {
        this.vonalKod = vonalKod;
        this.ar = ar;
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

    public long getAr() {
        return ar;
    }

    public String toString() {
        return "" + getGyarto() + getUrtartalom() + getAr() + getSzavatossagiIdo() + getZsirtartalom();
    }
}