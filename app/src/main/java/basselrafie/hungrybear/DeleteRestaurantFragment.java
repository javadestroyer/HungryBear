package basselrafie.hungrybear;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class DeleteRestaurantFragment extends Fragment {
    private EditText TxtRId;
    private Button BnDelete;
    private ImageButton BnHome;


    public DeleteRestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_delete_restaurant, container, false);

        TxtRId = view.findViewById(R.id.txt_delete_rid);
        BnDelete = view.findViewById(R.id.deleteRestaurant);
        BnHome = view.findViewById(R.id.home_button);

        BnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), MainActivity.class);
                startActivity(i);

            }
        });

        BnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = TxtRId.getText().toString();
                Restaurants restaurants = new Restaurants("","","","","","","","","","","","","","","","","","","","");
                restaurants.setRid(id);

                AdminHome.restaurantDatabase.dao().deleteRestaurant(restaurants);

                Toast.makeText(getContext(),"Restaurant deleted", Toast.LENGTH_SHORT).show();
                TxtRId.setText("");
            }
        });


        return view;
    }

}
