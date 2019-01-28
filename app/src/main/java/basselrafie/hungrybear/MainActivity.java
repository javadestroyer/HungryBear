package basselrafie.hungrybear;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

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
    Button Admin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
