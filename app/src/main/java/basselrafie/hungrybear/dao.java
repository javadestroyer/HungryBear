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

    @Query("SELECT * FROM restaurant WHERE Doener = 'true'")
    public List<Restaurants> getDoener();

    @Query("SELECT * FROM restaurant WHERE Pizza = 'true'")
    public List<Restaurants> getPizza();

    @Query("SELECT * FROM restaurant WHERE Italienisch = 'true'")
    public List<Restaurants> getItalian();

    @Query("SELECT * FROM restaurant WHERE Asiatisch = 'true'")
    public List<Restaurants> getAsian();

    @Query("SELECT * FROM restaurant WHERE Steak = 'true'")
    public List<Restaurants> getSteak();

    @Query("SELECT * FROM restaurant WHERE Burger = 'true'")
    public List<Restaurants> getBurger();

    @Query("SELECT * FROM restaurant WHERE Baguette = 'true'")
    public List<Restaurants> getBaguette();

    @Query("SELECT * FROM restaurant WHERE Salat = 'true'")
    public List<Restaurants> getSalad();

    @Query("SELECT * FROM restaurant WHERE Fisch = 'true'")
    public List<Restaurants> getFish();

}
