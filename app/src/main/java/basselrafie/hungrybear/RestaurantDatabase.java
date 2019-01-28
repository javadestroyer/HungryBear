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

    //private static RestaurantDatabase INSTANCE;

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
            dao.addRestaurant(new Restaurants("100", "Test","true","true","true","true","true","true","true","true","true","Test","0","38678","Clausthal-Zellerfeld","05323","11:00","13:00"));
            //dao.addRestaurant(new Restaurants("1", "Euro Döner","","","","","","","","","","","","","","","",""));
            //dao.addRestaurant(new Restaurants("2", "Ju Bin Lou","","","","","","","","","","","","","","","",""));
            //dao.addRestaurant(new Restaurants("3", "Pizza Inn","","","","","","","","","","","","","","","",""));
            return null;
        }
    }*/

    /*public synchronized static RestaurantDatabase getInstance(Context context){
        if(INSTANCE == null){
            INSTANCE = buildDatabase(context);
        }
        return INSTANCE;
    }

    private static RestaurantDatabase buildDatabase(final Context context){
        return Room.databaseBuilder(context, RestaurantDatabase.class, "restaurantdb").addCallback(new Callback() {
            @Override
            public void onCreate(@NonNull SupportSQLiteDatabase db) {
                super.onCreate(db);
                Executors.newSingleThreadExecutor().execute(new Runnable() {
                    @Override
                    public void run() {
                        getInstance(context).dao().addRestaurant(Restaurants.populateData());
                    }
                });
            }
        }).build();
    }*/
}
