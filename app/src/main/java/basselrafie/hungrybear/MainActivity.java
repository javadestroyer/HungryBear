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
    ImageButton calzone;
    ImageButton baguette;
    ImageButton asian;
    ImageButton doener;
    ImageButton salad;
    ImageButton pasta;
    ImageButton steak;
    Button allMenus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        burger = findViewById(R.id.burger);
        pizza = findViewById(R.id.pizza);
        calzone = findViewById(R.id.calzone);
        baguette = findViewById(R.id.baguette);
        asian = findViewById(R.id.asian);
        doener = findViewById(R.id.doener);
        salad = findViewById(R.id.salad);
        pasta = findViewById(R.id.pasta);
        steak = findViewById(R.id.steak);
        allMenus = findViewById(R.id.allMenus);

        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent2);
            }
        });

        burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent2);
            }
        });

        calzone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent2);
            }
        });

        baguette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent2);
            }
        });

        asian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent2);
            }
        });

        doener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent2);
            }
        });

        salad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent2);
            }
        });

        pasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent2);
            }
        });

        steak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent2);
            }
        });

        allMenus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent2);
            }
        });
    }
}
