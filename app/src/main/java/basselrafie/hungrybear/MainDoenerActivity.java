package basselrafie.hungrybear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainDoenerActivity extends AppCompatActivity {
    TextView textView9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_doener);
        textView9 = findViewById(R.id.textView9);
        for (int i=0; i<MainActivity.categories.size();i++){
            if (MainActivity.categories.get(i).getDoener()==true){

            }
        }
    }
}
