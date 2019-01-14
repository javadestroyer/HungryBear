package basselrafie.hungrybear;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao

public interface dao {
    @Insert
    public void addRestaurant(Restaurants restaurants);

    @Query("SELECT * FROM restaurant")
    public List<Restaurants> getRestaurants();

    @Delete
    public void deleteRestaurant(Restaurants restaurants);

    @Update
    public void updateRestaurant(Restaurants restaurants);

    //@Query("SELECT * FROM restaurant WHERE Salat = 'Y'")
    //public List<Restaurants> getSalat();

}
