package bolt.aruk;

import java.util.Date;
/**
 * Created by ferenc on 2017.02.14..
 */
public abstract class Tej extends Elelmiszer{

    public static final int LITER = 4;
    public static final int FELLITER = 2;
    public static final int POHAR = 1;
    public static final double ZSIROS = 0.5;
    public static final double FELZSIROS = 0.25;

    protected Long vonalKod;
    protected int urtartalom;
    protected String gyarto;
    protected Date szavatossagiIdo;
    protected  double zsirtartalom;

    public Tej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom) {
        super(vonalKod, gyarto, szavatossagiIdo);
        this.vonalKod = vonalKod;
        this.gyarto = gyarto;
        this.szavatossagiIdo = szavatossagiIdo;
        this.urtartalom = urtartalom;
        this.zsirtartalom = zsirtartalom;
    }

    public Long getVonalKod() {
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