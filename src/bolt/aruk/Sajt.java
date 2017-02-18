package bolt.aruk;

import java.util.Date;

/**
 * Created by ferenc on 2017.02.17..
 */
public class Sajt extends Elelmiszer{

    protected double suly;
    protected double zsirtartalom;
    protected Long vonalKod;
    protected String gyarto;
    protected Date szavatossagiIdo;


    public Sajt(double suly, double zsirtartalom, Long vonalKod, String gyarto, Date szavatossagiIdo) {
        super(vonalKod, gyarto, szavatossagiIdo);
        this.suly = suly;
        this.zsirtartalom = zsirtartalom;
        this.vonalKod = vonalKod;
        this.gyarto = gyarto;
        this.szavatossagiIdo = szavatossagiIdo;
    }

    public double getSuly() {
        return suly;
    }

    public double getZsirtartalom() {
        return zsirtartalom;
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
        return "" + getGyarto() + getSuly() + getSzavatossagiIdo() + getVonalKod() + getZsirtartalom();
    }
}
