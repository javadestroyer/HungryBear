package basselrafie.hungrybear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayRestaurant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView textView, textView1;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_restaurant);
        textView = findViewById(R.id.txt_view);
        textView1 = findViewById(R.id.txt_view_2);

        //textView.setText("Hallo");

        Bundle extras = getIntent().getExtras();
        String data = extras.getString("RId");
        textView.setText(data);

        String data1 = extras.getString("RName");
        textView1.setText(data1);

    }

}
