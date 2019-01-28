package basselrafie.hungrybear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainBurgerActivity extends AppCompatActivity {
    TextView textView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        textView5 = findViewById(R.id.textView5);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_burger);
        for (int i=0; i<MainActivity.categories.size();i++){
            if (MainActivity.categories.get(i).getBurger()==true){

            }
        }
    }
}
