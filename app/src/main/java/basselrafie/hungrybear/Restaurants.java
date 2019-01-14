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

    //@ColumnInfo(name = "Salat")
    //private String rsalat;



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

    /*public String getRsalat() {
        return rsalat;
    }

    public void setRsalat(String rsalat) {
        this.rsalat = rsalat;
    }*/
}
