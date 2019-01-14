package basselrafie.hungrybear;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddRestaurantFragment extends Fragment {

    private EditText RId, RName;
    private Button BnRSave;



    public AddRestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_restaurant, container, false);

        RId = view.findViewById(R.id.txt_rid);
        RName = view.findViewById(R.id.txt_rname);
        //RSalat = view.findViewById(R.id.txt_rsalat);

        BnRSave = view.findViewById(R.id.bn_save_restaurant);

        BnRSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rid = Integer.parseInt(RId.getText().toString());
                String rname = RName.getText().toString();
                //String rsalat = RSalat.getText().toString();


                //neues Restaurant anlegen
                Restaurants restaurants = new Restaurants();
                restaurants.setRid(rid);
                restaurants.setRname(rname);
                //restaurants.setRsalat(rsalat);

                AdminHome.restaurantDatabase.dao().addRestaurant(restaurants);
                Toast.makeText(getContext(),"Restaurant added", Toast.LENGTH_SHORT).show();


                //Inhalte der Variablen löschen
                RId.setText("");
                RName.setText("");
                //RSalat.setText("");

            }

        });

        return view;
    }

}
