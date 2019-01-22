package basselrafie.hungrybear;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class AllFragment extends Fragment {

    private TextView TxtInfo;


    public AllFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_all, container, false);
        TxtInfo = view.findViewById(R.id.txt_display_info);

        List<Restaurants> restaurants = AdminHome.restaurantDatabase.dao().getRestaurants();

        String info = " ";

        for(Restaurants rest : restaurants)
        {
            int rid = rest.getRid();
            String rname = rest.getRname();

            info = info + "\n\nId: " + rid + "\nRestaurant: " + rname;
        }

        TxtInfo.setText(info);

        return view;
    }

}
