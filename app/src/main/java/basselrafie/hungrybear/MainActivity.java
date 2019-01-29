package basselrafie.hungrybear;

import android.arch.persistence.room.Room;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageButton burger;
    ImageButton pizza;
    ImageButton italian;
    ImageButton baguette;
    ImageButton asian;
    ImageButton doener;
    ImageButton salad;
    ImageButton fish;
    ImageButton steak;
    Button allMenus;
    ImageButton Admin;


    public static ArrayList <MainRestaurants> categories = new ArrayList<MainRestaurants>();
    RestaurantDatabase restaurantDatabase;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        restaurantDatabase = Room.databaseBuilder(getApplicationContext(),RestaurantDatabase.class, "restaurantdb").allowMainThreadQueries().build();


        Restaurants restaurants1 = new Restaurants("1", "Euro Döner","true","true","false","false","false","true","false","false","false","Adolph-Römer-Straße","7","38678","Clausthal-Zellerfeld","05323 840230","11:00","23:00");
        Restaurants restaurants2 = new Restaurants("2", "Pizza Inn","false","true","true","false","false","false","true","true","false","Adolph-Römer-Straße","21","38678","Clausthal-Zellerfeld","05323 982588","11:30","22:00");
        Restaurants restaurants3 = new Restaurants("3", "Ju Bin Lou","false","false","false","true","false","false","false","false","false","Schulstraße","47","38678","Clausthal-Zellerfeld","05323 7018421","11:30","22:00");

        restaurantDatabase.dao().deleteRestaurant(restaurants1);
        restaurantDatabase.dao().addRestaurant(restaurants1);
        restaurantDatabase.dao().deleteRestaurant(restaurants2);
        restaurantDatabase.dao().addRestaurant(restaurants2);
        restaurantDatabase.dao().deleteRestaurant(restaurants3);
        restaurantDatabase.dao().addRestaurant(restaurants3);


        burger = findViewById(R.id.burger);
        pizza = findViewById(R.id.pizza);
        italian = findViewById(R.id.italian);
        baguette = findViewById(R.id.baguette);
        asian = findViewById(R.id.asian);
        doener = findViewById(R.id.doener);
        salad = findViewById(R.id.salad);
        fish = findViewById(R.id.fish);
        steak = findViewById(R.id.steak);
        allMenus = findViewById(R.id.allMenus);
        Admin = findViewById(R.id.Bn_Admin);





        MainRestaurants euroDoener = new MainRestaurants();
        categories.add(euroDoener);
        euroDoener.setBaguette(false);
        euroDoener.setAsian(false);
        euroDoener.setBurger(true);
        euroDoener.setDoener(true);
        euroDoener.setFish(false);
        euroDoener.setPizza(true);
        euroDoener.setSalad(true);
        euroDoener.setSteak(false);
        euroDoener.setItalian(true);
        euroDoener.setRestaurantName("Euro Döner");
        euroDoener.setOpeningTimes("10-22");



        MainRestaurants pizzaInn = new MainRestaurants();
        categories.add(pizzaInn);
        pizzaInn.setBaguette(true);
        pizzaInn.setAsian(false);
        pizzaInn.setBurger(false);
        pizzaInn.setDoener(false);
        pizzaInn.setFish(false);
        pizzaInn.setPizza(true);
        pizzaInn.setSalad(false);
        pizzaInn.setSteak(false);
        pizzaInn.setItalian(true);
        pizzaInn.setRestaurantName("Pizza Inn");
        pizzaInn.setOpeningTimes("10-22");

        MainRestaurants juBinLou = new MainRestaurants();
        categories.add(juBinLou);
        juBinLou.setBaguette(false);
        juBinLou.setAsian(true);
        juBinLou.setBurger(false);
        juBinLou.setDoener(false);
        juBinLou.setFish(true);
        juBinLou.setPizza(false);
        juBinLou.setSalad(true);
        juBinLou.setSteak(false);
        juBinLou.setItalian(false);
        juBinLou.setRestaurantName("Ju Bin Lou");
        juBinLou.setOpeningTimes("10-22");


        MainRestaurants daMario = new MainRestaurants();
        categories.add(daMario);
        daMario.setBaguette(false);
        daMario.setAsian(false);
        daMario.setBurger(true);
        daMario.setDoener(false);
        daMario.setFish(true);
        daMario.setPizza(true);
        daMario.setSalad(true);
        daMario.setSteak(true);
        daMario.setItalian(true);
        daMario.setRestaurantName("Da Mario");
        daMario.setOpeningTimes("10-22");


        Admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(MainActivity.this, AdminHome.class);
                startActivity(j);
            }
        });

        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, MainPizza.class);
                startActivity(intent2);

            }
        });

        burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, MainBurger.class);
                startActivity(intent2);
            }
        });

        italian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, MainItalian.class);
                startActivity(intent2);
            }
        });

        baguette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, MainBaguette.class);
                startActivity(intent2);
            }
        });

        asian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, MainAsian.class);
                startActivity(intent2);
            }
        });

        doener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iDoener = new Intent(MainActivity.this, MainDoener.class);
                startActivity(iDoener);
            }
        });

        salad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, MainSalad.class);
                startActivity(intent2);
            }
        });

        fish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, MainFish.class);
                startActivity(intent2);
            }
        });

        steak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, MainSteak.class);
                startActivity(intent2);
            }
        });

        allMenus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, MainViewAll.class);
                startActivity(intent2);
            }
        });


    }
}
