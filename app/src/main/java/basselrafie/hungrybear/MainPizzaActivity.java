package basselrafie.hungrybear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainPizzaActivity extends AppCompatActivity {
    TextView textView14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pizza);
        textView14 = findViewById(R.id.textView14);
        for (int i=0; i<MainActivity.categories.size();i++){
            if (MainActivity.categories.get(i).getPizza()==true){


            }
        }
    }
}
