package basselrafie.hungrybear;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "Restaurant")
public class Restaurants {

    @ColumnInfo(name = "RestaurantId")
    @PrimaryKey
    private int rid;

    @ColumnInfo(name = "RestaurantName")
    private String rname;

    @ColumnInfo(name = "Döner")
    private String rdoener;

    @ColumnInfo(name = "Pizza")
    private String rpizza;

    @ColumnInfo(name = "Italienisch")
    private String ritalian;

    @ColumnInfo(name = "Asiatisch")
    private String rasian;

    @ColumnInfo(name = "Steak")
    private String rsteak;

    @ColumnInfo(name = "Burger")
    private String rburger;

    @ColumnInfo(name = "Baguette")
    private String rbaguette;

    @ColumnInfo(name = "Salat")
    private String rsalat;

    @ColumnInfo(name = "Fisch")
    private String rfish;



    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getRsalat() {
        return rsalat;
    }

    public String getRdoener() {
        return rdoener;
    }

    public void setRdoener(String rdoener) {
        this.rdoener = rdoener;
    }

    public String getRpizza() {
        return rpizza;
    }

    public void setRpizza(String rpizza) {
        this.rpizza = rpizza;
    }

    public String getRitalian() {
        return ritalian;
    }

    public void setRitalian(String ritalian) {
        this.ritalian = ritalian;
    }

    public String getRasian() {
        return rasian;
    }

    public void setRasian(String rasian) {
        this.rasian = rasian;
    }

    public String getRsteak() {
        return rsteak;
    }

    public void setRsteak(String rsteak) {
        this.rsteak = rsteak;
    }

    public String getRburger() {
        return rburger;
    }

    public void setRburger(String rburger) {
        this.rburger = rburger;
    }

    public String getRbaguette() {
        return rbaguette;
    }

    public void setRbaguette(String rbaguette) {
        this.rbaguette = rbaguette;
    }

    public String getRfish() {
        return rfish;
    }

    public void setRfish(String rfish) {
        this.rfish = rfish;
    }

    public void setRsalat(String rsalat) {
        this.rsalat = rsalat;
    }
}
