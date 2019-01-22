package basselrafie.hungrybear;

import android.arch.persistence.room.Room;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DoenerView extends AppCompatActivity {

    public static FragmentManager fragmentManager;
    public static RestaurantDatabase restaurantDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doener_view);
        fragmentManager = getSupportFragmentManager();
        restaurantDatabase = Room.databaseBuilder(getApplicationContext(),RestaurantDatabase.class, "restaurantdb").allowMainThreadQueries().build();

        if(findViewById(R.id.fragment_container)!=null)
        {
            if(savedInstanceState!=null)
            {
                return;
            }

            fragmentManager.beginTransaction().add(R.id.fragment_container, new DoenerFragment()).commit();
        }

    }
}