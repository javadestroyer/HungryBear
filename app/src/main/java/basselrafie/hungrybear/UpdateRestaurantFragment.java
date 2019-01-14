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
public class UpdateRestaurantFragment extends Fragment {
    private EditText RId, RName;
    private Button BnUpdate;


    public UpdateRestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_update_restaurant, container, false);

        RId = view.findViewById(R.id.txt_rid);
        RName = view.findViewById(R.id.txt_rname);

        BnUpdate = view.findViewById(R.id.bn_update);

        BnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rid = Integer.parseInt(RId.getText().toString());
                String rname = RName.getText().toString();

                Restaurants restaurants = new Restaurants();
                restaurants.setRid(rid);
                restaurants.setRname(rname);

                AdminHome.restaurantDatabase.dao().updateRestaurant(restaurants);
                Toast.makeText(getActivity(), "Restaurant updated", Toast.LENGTH_SHORT).show();

                RId.setText("");
                RName.setText("");
            }
        });


        return view;
    }


}
