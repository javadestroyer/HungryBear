package basselrafie.hungrybear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainFishActivity extends AppCompatActivity {
    TextView textView11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fish);
        textView11 = findViewById(R.id.textView11);
        for (int i=0; i<MainActivity.categories.size();i++){
            if (MainActivity.categories.get(i).getFish()==true){

            }
        }
    }
}
