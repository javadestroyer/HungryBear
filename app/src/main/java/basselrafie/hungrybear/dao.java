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
    public void addRestaurant(Restaurants... restaurants);

    @Query("SELECT * FROM restaurant ORDER BY RestaurantId ASC")
    public List<Restaurants> getRestaurants();

    @Query("SELECT * FROM restaurant ORDER BY RestaurantName ASC")
    public List<Restaurants> getViewAll();

    @Delete
    public void deleteRestaurant(Restaurants... restaurants);

    @Update
    public void updateRestaurant(Restaurants... restaurants);

    @Query("SELECT * FROM restaurant WHERE Doener = 'true' ORDER BY RestaurantName ASC")
    public List<Restaurants> getDoener();

    @Query("SELECT * FROM restaurant WHERE Pizza = 'true' ORDER BY RestaurantName ASC")
    public List<Restaurants> getPizza();

    @Query("SELECT * FROM restaurant WHERE Italienisch = 'true' ORDER BY RestaurantName ASC")
    public List<Restaurants> getItalian();

    @Query("SELECT * FROM restaurant WHERE Asiatisch = 'true' ORDER BY RestaurantName ASC")
    public List<Restaurants> getAsian();

    @Query("SELECT * FROM restaurant WHERE Steak = 'true' ORDER BY RestaurantName ASC")
    public List<Restaurants> getSteak();

    @Query("SELECT * FROM restaurant WHERE Burger = 'true' ORDER BY RestaurantName ASC")
    public List<Restaurants> getBurger();

    @Query("SELECT * FROM restaurant WHERE Baguette = 'true' ORDER BY RestaurantName ASC")
    public List<Restaurants> getBaguette();

    @Query("SELECT * FROM restaurant WHERE Salat = 'true' ORDER BY RestaurantName ASC")
    public List<Restaurants> getSalad();

    @Query("SELECT * FROM restaurant WHERE Fisch = 'true' ORDER BY RestaurantName ASC")
    public List<Restaurants> getFish();

}
