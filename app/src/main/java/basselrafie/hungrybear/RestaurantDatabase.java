package basselrafie.hungrybear;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Restaurants.class}, version = 1)
public abstract class RestaurantDatabase extends RoomDatabase {

    public abstract dao dao();
}
