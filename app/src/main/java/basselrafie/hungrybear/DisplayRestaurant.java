package basselrafie.hungrybear;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class DisplayRestaurant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView textView, textView1, textView2, RLink;
        ImageButton imageButton;
        ImageView imageView;


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_restaurant);
        textView1 = findViewById(R.id.txt_view_2);
        textView = findViewById(R.id.textView5);
        textView2 = findViewById(R.id.txt_rtelefon);
        RLink = findViewById(R.id.txt_rlink);
        imageView = findViewById(R.id.imageView);
        imageButton = findViewById(R.id.calleurodoener);

        final Bundle extras = getIntent().getExtras();

        String telefon = extras.getString("RTelefon");
        final String telefonnr = "tel:" + telefon;

        textView2.setText(telefon);


        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse(telefonnr));
                startActivity(callIntent);
            }
        });

        String data1 = extras.getString("RName");
        textView1.setText(data1);

        String UVon = extras.getString("RVon");
        String UBis = extras.getString("RBis");
        textView.setText(UVon + " Uhr - " + UBis + " Uhr");


        String rlink = extras.getString("RLink");
        if(rlink.matches("Kein Link vorhanden")){
            RLink.setText(extras.getString("RStraße")+ " " + extras.getString("RHausNr"));
        }
        else {
            String rLink = "<a href=\"" + rlink + "\">" + extras.getString("RStraße") + " " + extras.getString("RHausNr") + "</a>";
            RLink.setText(Html.fromHtml(rLink));

            RLink.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        }




        int RBild = getResources().getIdentifier(extras.getString("RBild"), "drawable", getPackageName());
        imageView.setImageResource(RBild);

    }

}
