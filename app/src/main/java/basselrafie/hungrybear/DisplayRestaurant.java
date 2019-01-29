package basselrafie.hungrybear;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static basselrafie.hungrybear.R.string.phone_number;

public class DisplayRestaurant extends AppCompatActivity {

    Button call;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView textView, textView1;
        Button calleurodoener;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_restaurant);
        textView1 = findViewById(R.id.txt_view_2);
        textView = findViewById(R.id.textView5);
        calleurodoener = findViewById(R.id.calleurodoener);


        calleurodoener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:123456789"));
                startActivity(callIntent);
            }
        });

        //textView.setText("Hallo");

        Bundle extras = getIntent().getExtras();

        String data1 = extras.getString("RName");
        textView1.setText(data1);

        String UVon = extras.getString("RVon");
        String UBis = extras.getString("RBis");
        textView.setText(UVon + " Uhr - " + UBis + " Uhr");

    }

}
