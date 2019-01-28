package basselrafie.hungrybear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainItalianActivity extends AppCompatActivity {
    TextView textView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_italian);
        textView6 = findViewById(R.id.textView6);
        for (int i=0; i<MainActivity.categories.size();i++){
            if (MainActivity.categories.get(i).getItalian()==true){

            }
        }
    }
}
