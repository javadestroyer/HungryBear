package basselrafie.hungrybear;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {

    private Button BnAddRestaurant, BnViewRestaurant, BnDeleteREstaurant, BnUpdateRestaurant;
    private ImageButton BnHome;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        BnAddRestaurant = view.findViewById(R.id.bn_add_restaurant);
        BnAddRestaurant.setOnClickListener(this);

        BnViewRestaurant = view.findViewById(R.id.bn_view_restaurant);
        BnViewRestaurant.setOnClickListener(this);

        BnDeleteREstaurant = view.findViewById(R.id.bn_delete_restaurant);
        BnDeleteREstaurant.setOnClickListener(this);

        BnUpdateRestaurant = view.findViewById(R.id.bn_update_Restaurant);
        BnUpdateRestaurant.setOnClickListener(this);

        BnHome = view.findViewById(R.id.home_button);
        BnHome.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        switch(v.getId())
        {
            case R.id.bn_add_restaurant:
                AdminHome.fragmentManager.beginTransaction().replace(R.id.fragment_container, new AddRestaurantFragment()).addToBackStack(null).commit();

                break;

            case R.id.bn_view_restaurant:
                AdminHome.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ViewRestaurantFragment()).addToBackStack(null).commit();

                break;

            case R.id.bn_delete_restaurant:
                AdminHome.fragmentManager.beginTransaction().replace(R.id.fragment_container, new DeleteRestaurantFragment()).addToBackStack(null).commit();

                break;

            case R.id.bn_update_Restaurant:
                AdminHome.fragmentManager.beginTransaction().replace(R.id.fragment_container, new UpdateRestaurantFragment()).addToBackStack(null).commit();

                break;

            case R.id.home_button:
                        Intent i = new Intent(getContext(), MainActivity.class);
                        startActivity(i);
        }
    }

}
