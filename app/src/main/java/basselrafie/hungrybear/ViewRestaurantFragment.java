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
public class ViewRestaurantFragment extends Fragment {

    private TextView TxtInfo;


    public ViewRestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_view_restaurant, container, false);
        TxtInfo = view.findViewById(R.id.txt_display_info);

        List<Restaurants> restaurants = AdminHome.restaurantDatabase.dao().getRestaurants();

        String info = " ";

        for(Restaurants rest : restaurants)
        {
            int rid = rest.getRid();
            String rname = rest.getRname();
            String rstraße = rest.getRstraße();
            String rhausnr = rest.getRhausnr();
            String rplz = rest.getRplz();
            String rort = rest.getRort();
            String rtelefon = rest.getRtelefon();
            String rvon = rest.getRvon();
            String rbis = rest.getRbis();
            String rpizza = rest.getRpizza();
            String rburger = rest.getRburger();
            String ritalian = rest.getRitalian();
            String rbaguette = rest.getRbaguette();
            String rasian = rest.getRasian();
            String rdoener = rest.getRdoener();
            String rsalad = rest.getRsalat();
            String rfish = rest.getRfish();
            String rsteak = rest.getRsteak();

            info = info + "\n\nId: " + rid + "Restaurant: " + rname +
                    "\nPizza: " + rpizza + " | Burger: " + rburger + " | Italian: " + ritalian +
                    "\nBaguette: " + rbaguette + " | Asian: " + rasian + " | Döner: " + rdoener +
                    "\nSalad: " + rsalad + " | Fish: " + rfish + " | Steak: " + rsteak +
                    "Adresse: " + rstraße + " " + rhausnr + ",\n " + rplz + " " + rort +
                    "Telefon: " + rtelefon + " | Geöffnet von " + rvon + " bis " + rbis;
        }

        TxtInfo.setText(info);

        return view;
    }

}
