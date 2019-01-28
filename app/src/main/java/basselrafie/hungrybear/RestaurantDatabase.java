package basselrafie.hungrybear;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.os.AsyncTask;
import android.support.annotation.NonNull;

import java.util.concurrent.Executors;

@Database(entities = {Restaurants.class}, version = 1, exportSchema = false)
public abstract class RestaurantDatabase extends RoomDatabase {

    //private static RestaurantDatabase instance;

    public abstract dao dao();

    /*public static synchronized RestaurantDatabase getInstance(Context context){
        if(instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(), RestaurantDatabase.class, "restaurantdb").fallbackToDestructiveMigration().addCallback(roomCallback).build();
        }
        return instance;
    }

    private static RoomDatabase.Callback roomCallback = new RoomDatabase.Callback(){
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new PopulateDbAsyncTask(instance).execute();
        }
    };

    private static class PopulateDbAsyncTask extends AsyncTask<Void, Void, Void>{
        private dao dao;

        private PopulateDbAsyncTask(RestaurantDatabase db){
            dao = db.dao();
        }

        @Override
        protected Void doInBackground(Void... voids){
            dao.addRestaurant(new Restaurants("Test", "false","","","","","","","","","","","","","","",""));
            return null;
        }
    }*/
}
