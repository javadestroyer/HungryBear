package basselrafie.hungrybear;

import android.arch.persistence.room.Room;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class MainAsian extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    private Context context;
    public static RestaurantDatabase restaurantDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_asian);
        restaurantDatabase = Room.databaseBuilder(getApplicationContext(),RestaurantDatabase.class, "restaurantdb").allowMainThreadQueries().build();

        recyclerView = findViewById(R.id.recycler_view);
        context = MainAsian.this;


        List<Restaurants> restaurants = restaurantDatabase.dao().getAsian();


        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        adapter = new RestaurantAdapter(restaurants,context);
        recyclerView.setAdapter(adapter);
    }
}
