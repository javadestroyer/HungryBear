package basselrafie.hungrybear;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainPizzaActivity extends AppCompatActivity {
    TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView4 = findViewById(R.id.textView4);
        for (int i=0; i<MainActivity.categories.size();i++){
            if (MainActivity.categories.get(i).getPizza()==true){

            }
        }
    }
}
