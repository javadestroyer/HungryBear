package basselrafie.hungrybear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainSaladActivity extends AppCompatActivity {
    TextView textView10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_salad);
        textView10 = findViewById(R.id.textView10);
        for (int i=0; i<MainActivity.categories.size();i++){
            if (MainActivity.categories.get(i).getSalad()==true){

            }
        }
    }
}
