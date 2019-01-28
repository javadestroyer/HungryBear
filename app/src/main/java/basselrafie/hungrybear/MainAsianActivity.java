package basselrafie.hungrybear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainAsianActivity extends AppCompatActivity {

    TextView textView8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_asian);
        textView8 = findViewById(R.id.textView8);
        for (int i=0; i<MainActivity.categories.size();i++){
            if (MainActivity.categories.get(i).getAsian()==true){

            }
        }
    }
}
