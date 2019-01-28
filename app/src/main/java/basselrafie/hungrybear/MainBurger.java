package basselrafie.hungrybear;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainBurger extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    public static RestaurantDatabase restaurantDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_burger);
        restaurantDatabase = Room.databaseBuilder(getApplicationContext(),RestaurantDatabase.class, "restaurantdb").allowMainThreadQueries().build();

        recyclerView = findViewById(R.id.recycler_view);

        //RestaurantDatabase rdb = Room.databaseBuilder(getApplicationContext(), RestaurantDatabase.class, "restaurant_db").allowMainThreadQueries().build();

        List<Restaurants> restaurants = restaurantDatabase.dao().getBurger();

        //List<Restaurants> restaurants = new ArrayList<>();
        //restaurants.add(new Restaurants("Line 1", "Line 2", "","","","","","","",""));
        //restaurants.add(new Restaurants("Line 2", "Line 2", "","","","","","","",""));
        //restaurants.add(new Restaurants("Line 3", "Line 2", "","","","","","","",""));
        //restaurants.add(new Restaurants("Line 4", "Line 2", "","","","","","","",""));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RestaurantAdapter(restaurants);
        recyclerView.setAdapter(adapter);
    }
}
