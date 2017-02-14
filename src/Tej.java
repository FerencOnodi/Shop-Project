import java.util.Date;

/**
 * Created by ferenc on 2017.02.14..
 */
public class Tej {

    private int urtartalom;
    private String gyarto;
    private Date szavatossagiIdo;
    private  double zsirtartalom;
    private long ar;

    public Tej(int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom, long ar) {
        this.ar = ar;
        this.gyarto = gyarto;
        this.szavatossagiIdo = szavatossagiIdo;
        this.urtartalom = urtartalom;
        this.zsirtartalom = zsirtartalom;
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
        return "";
    }
}
