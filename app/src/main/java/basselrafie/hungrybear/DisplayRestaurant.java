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
        textView1 = findViewById(R.id.txt_view_2);
        textView = findViewById(R.id.textView5);

        //textView.setText("Hallo");

        Bundle extras = getIntent().getExtras();

        String data1 = extras.getString("RName");
        textView1.setText(data1);

        String UVon = extras.getString("RVon");
        String UBis = extras.getString("RBis");
        textView.setText(UVon + " Uhr - " + UBis + " Uhr");

    }

}
