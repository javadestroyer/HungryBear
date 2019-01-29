package basselrafie.hungrybear;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "Restaurant")
public class Restaurants {

    public Restaurants(@NonNull String rid, String rname, String rdoener, String rpizza, String ritalian, String rasian, String rsteak, String rburger, String rbaguette,
                       String rsalat, String rfish, String rstraße, String rhausnr, String rplz, String rort, String rtelefon, String rvon, String rbis, String rlink, String rbild) {

        this.rid = rid;
        this.rname = rname;
        this.rdoener = rdoener;
        this.rpizza = rpizza;
        this.ritalian = ritalian;
        this.rasian = rasian;
        this.rsteak = rsteak;
        this.rburger = rburger;
        this.rbaguette = rbaguette;
        this.rsalat = rsalat;
        this.rfish = rfish;
        this.rstraße = rstraße;
        this.rhausnr = rhausnr;
        this.rplz = rplz;
        this.rort = rort;
        this.rtelefon = rtelefon;
        this.rvon = rvon;
        this.rbis = rbis;
        this.rlink = rlink;
        this.rbild = rbild;
    }

    @ColumnInfo(name = "RestaurantId")
    @PrimaryKey
    @NonNull private String rid;

    @ColumnInfo(name = "RestaurantName")
    private String rname;

    @ColumnInfo(name = "Doener")
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

    @ColumnInfo(name = "Straße")
    private String rstraße;

    @ColumnInfo(name = "HausNr")
    private String rhausnr;

    @ColumnInfo(name = "PLZ")
    private String rplz;

    @ColumnInfo(name = "Ort")
    private String rort;

    @ColumnInfo(name = "TelefonNr")
    private String rtelefon;

    @ColumnInfo(name = "ÖffnungszeitV")
    private String rvon;

    @ColumnInfo(name = "ÖffnungszeitB")
    private String rbis;

    @ColumnInfo(name = "MapsLink")
    private String rlink;

    @ColumnInfo(name = "BildQuelle")
    private String rbild;

    //@ColumnInfo(name = "ÖffnungszeitB")
    //private String rbis;

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
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

    public String getRsalat() {
        return rsalat;
    }

    public void setRsalat(String rsalat) {
        this.rsalat = rsalat;
    }

    public String getRfish() {
        return rfish;
    }

    public void setRfish(String rfish) {
        this.rfish = rfish;
    }

    public String getRstraße() {
        return rstraße;
    }

    public void setRstraße(String rstraße) {
        this.rstraße = rstraße;
    }

    public String getRhausnr() {
        return rhausnr;
    }

    public void setRhausnr(String rhausnr) {
        this.rhausnr = rhausnr;
    }

    public String getRplz() {
        return rplz;
    }

    public void setRplz(String rplz) {
        this.rplz = rplz;
    }

    public String getRort() {
        return rort;
    }

    public void setRort(String rort) {
        this.rort = rort;
    }

    public String getRtelefon() {
        return rtelefon;
    }

    public void setRtelefon(String rtelefon) {
        this.rtelefon = rtelefon;
    }

    public String getRvon() {
        return rvon;
    }

    public void setRvon(String rvon) {
        this.rvon = rvon;
    }

    public String getRbis() {
        return rbis;
    }

    public void setRbis(String rbis) {
        this.rbis = rbis;
    }

    public String getRlink() {
        return rlink;
    }

    public void setRlink(String rlink) {
        this.rlink = rlink;
    }

    public String getRbild() {
        return rbild;
    }

    public void setRbild(String rbild) {
        this.rbild = rbild;
    }
}