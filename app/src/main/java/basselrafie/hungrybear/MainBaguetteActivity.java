package basselrafie.hungrybear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainBaguetteActivity extends AppCompatActivity {
    TextView textView7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_baguette);
        textView7 = findViewById(R.id.textView7);
        for (int i=0; i<MainActivity.categories.size();i++){
            if (MainActivity.categories.get(i).getBaguette()==true){

            }
        }
    }
}
