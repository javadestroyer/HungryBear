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


        Restaurants restaurants1 = new Restaurants("1", "Euro Döner","true","true","false","false","false","true","false","false","false","Adolph-Römer-Straße","7","38678","Clausthal-Zellerfeld","05323 840230","11:00","23:00","https://www.google.com/maps?q=euro+d%C3%B6ner+clausthal&um=1&ie=UTF-8&sa=X&ved=0ahUKEwjfrb--hJXgAhVrA2MBHSqhCIYQ_AUIDygC","euro_doener_speisekarte");
        Restaurants restaurants2 = new Restaurants("2", "Pizza Inn","false","true","true","false","false","false","true","true","false","Adolph-Römer-Straße","21","38678","Clausthal-Zellerfeld","05323 982588","11:30","22:00","https://www.google.com/maps/place/Pizza+Inn+Clz+-good+thinking-/@51.8055555,10.3322682,17z/data=!3m1!4b1!4m5!3m4!1s0x47a53bedd9c8396b:0x26f0758118b81c76!8m2!3d51.8055555!4d10.3344569",".");
        Restaurants restaurants3 = new Restaurants("3", "Ju Bin Lou","false","false","false","true","false","false","false","false","false","Schulstraße","47","38678","Clausthal-Zellerfeld","05323 7018421","11:30","22:00","https://www.google.com/maps/place/Ju+Bin+Lou/@51.8020722,10.3362952,17z/data=!3m1!4b1!4m5!3m4!1s0x47a53bf2faaa3ea9:0x47c7969fded4c67e!8m2!3d51.8020722!4d10.3384839","ju_bin_lou_speisekarte");
        Restaurants restaurants4 = new Restaurants("4", "Ristorante Pizzeria Da Mario","false","true","true","false","true","false","false","true","true","Adolph-Roemer-Straße","33","38678","Clausthal-Zellerfeld","05323 5630","11:30","23:00","https://www.google.com/maps/place/Pizzeria+Da+Mario+Inh.+Antonio+Viola/@51.8062124,10.3328517,17z/data=!3m1!4b1!4m5!3m4!1s0x47a53b85b5ba11dd:0xa08284446bb71a71!8m2!3d51.8062124!4d10.3350404","da_mario_speisekarte");
        Restaurants restaurants5 = new Restaurants("5", "Mekong","false","false","false","true","false","false","false","true","true","Sorge","2","38678","Clausthal-Zellerfeld","05323 9825928","11:30","21:30","https://www.google.com/maps/place/Mekong+-+Asia+Imbiss+und+Restaurant/@51.8068329,10.3327521,17z/data=!3m1!4b1!4m5!3m4!1s0x47a53bee68e0c4ff:0x14ace7595fabd030!8m2!3d51.8068329!4d10.3349408",".");
        Restaurants restaurants6 = new Restaurants("6", "Ratskeller","false","false","true","false","true","false","false","true","true","An der Marktkirche","8","38678","Clausthal-Zellerfeld","05323 2627","12:00","23:00","https://www.google.com/maps/place/Restaurant+Ratskeller/@51.8036401,10.3312108,17z/data=!3m1!4b1!4m5!3m4!1s0x47a53bedafd526f1:0x48161a55858e1405!8m2!3d51.8036401!4d10.3333995",".");
        Restaurants restaurants7 = new Restaurants("7", "Glück-Auf","false","false","true","false","true","false","false","true","true","An der Marktkirche","7","38678","Clausthal-Zellerfeld","05323 1616","12:00","22:00","https://www.google.com/maps/place/Restaurant+Gl%C3%BCck-Auf/@51.803539,10.3316403,17z/data=!3m1!4b1!4m5!3m4!1s0x47a53beda410a365:0x88a4d281b89c5dba!8m2!3d51.803539!4d10.333829",".");

        restaurantDatabase.dao().deleteRestaurant(restaurants1);
        restaurantDatabase.dao().addRestaurant(restaurants1);
        restaurantDatabase.dao().deleteRestaurant(restaurants2);
        restaurantDatabase.dao().addRestaurant(restaurants2);
        restaurantDatabase.dao().deleteRestaurant(restaurants3);
        restaurantDatabase.dao().addRestaurant(restaurants3);
        restaurantDatabase.dao().deleteRestaurant(restaurants4);
        restaurantDatabase.dao().addRestaurant(restaurants4);
        restaurantDatabase.dao().deleteRestaurant(restaurants5);
        restaurantDatabase.dao().addRestaurant(restaurants5);
        restaurantDatabase.dao().deleteRestaurant(restaurants6);
        restaurantDatabase.dao().addRestaurant(restaurants6);
        restaurantDatabase.dao().deleteRestaurant(restaurants7);
        restaurantDatabase.dao().addRestaurant(restaurants7);


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
