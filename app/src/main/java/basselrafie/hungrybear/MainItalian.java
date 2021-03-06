package basselrafie.hungrybear;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class MainItalian extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    public static RestaurantDatabase restaurantDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_italian);
        restaurantDatabase = Room.databaseBuilder(getApplicationContext(),RestaurantDatabase.class, "restaurantdb").allowMainThreadQueries().build();

        recyclerView = findViewById(R.id.recycler_view);


        List<Restaurants> restaurants = restaurantDatabase.dao().getItalian();


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RestaurantAdapter(restaurants, this);
        recyclerView.setAdapter(adapter);
    }
}
