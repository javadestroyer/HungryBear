package basselrafie.hungrybear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainSteakActivity extends AppCompatActivity {
    TextView textView12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_steak);
        textView12 = findViewById(R.id.textView12);
        for (int i=0; i<MainActivity.categories.size();i++){
            if (MainActivity.categories.get(i).getSteak()==true){

            }
        }
    }
}
