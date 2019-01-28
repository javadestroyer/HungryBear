package basselrafie.hungrybear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainAllMenusActivity extends AppCompatActivity {
    TextView textView13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_all_menus);
        textView13 = findViewById(R.id.textView13);

    }
}
