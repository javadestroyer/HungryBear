package basselrafie.hungrybear;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddRestaurantFragment extends Fragment {

    private EditText RId, RName, RStraße, RHausNr, Rplz, ROrt, RTelefon, RVon, RBis, RLink, RBild;
    private CheckBox RDoener, RPizza, RItalian, RAsian, RSteak, RBurger, RBaguette, RSalad, RFish;
    private Button BnRSave;
    private ImageButton BnHome;



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
        RStraße = view.findViewById(R.id.txt_rstraße);
        RHausNr = view.findViewById(R.id.txt_rhausnr);
        Rplz = view.findViewById(R.id.txt_rplz);
        ROrt = view.findViewById(R.id.txt_rort);
        RTelefon = view.findViewById(R.id.txt_rtelefon);
        RVon = view.findViewById(R.id.txt_rvon);
        RBis = view.findViewById(R.id.txt_rbis);
        RDoener = view.findViewById(R.id.cb_doener);
        RPizza = view.findViewById(R.id.cb_pizza);
        RItalian = view.findViewById(R.id.cb_italian);
        RAsian = view.findViewById(R.id.cb_asian);
        RSteak = view.findViewById(R.id.cb_steak);
        RBurger = view.findViewById(R.id.cb_burger);
        RBaguette = view.findViewById(R.id.cb_baguette);
        RSalad = view.findViewById(R.id.cb_salad);
        RFish = view.findViewById(R.id.cb_fish);
        RLink = view.findViewById(R.id.txt_rlink);
        RBild = view.findViewById(R.id.txt_rbild);

        BnRSave = view.findViewById(R.id.bn_save_restaurant);
        BnHome = view.findViewById(R.id.home_button);

        BnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), MainActivity.class);
                startActivity(i);

            }
        });

        BnRSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rid = RId.getText().toString();
                String rname = RName.getText().toString();
                String rstraße = RStraße.getText().toString();
                String rhausnr = RHausNr.getText().toString();
                String rplz = Rplz.getText().toString();
                String rort = ROrt.getText().toString();
                String rtelefon = RTelefon.getText().toString();
                String rvon = RVon.getText().toString();
                String rbis = RBis.getText().toString();
                String rdoener = String.valueOf(RDoener.isChecked());
                String rpizza = String.valueOf(RPizza.isChecked());
                String ritalian = String.valueOf(RItalian.isChecked());
                String rasian = String.valueOf(RAsian.isChecked());
                String rsteak = String.valueOf(RSteak.isChecked());
                String rburger = String.valueOf(RBurger.isChecked());
                String rbaguette = String.valueOf(RBaguette.isChecked());
                String rsalad = String.valueOf(RSalad.isChecked());
                String rfish = String.valueOf(RFish.isChecked());
                String rlink = RLink.getText().toString();
                String rbild = RBild.getText().toString();

                //Abfrage ob Felder gefüllt sind

                try {

                    if (TextUtils.isEmpty(rid)) {
                        RId.setError("ID muss gefüllt sein");
                    }
                    if (TextUtils.isEmpty(rname)) {
                        RName.setError("Name muss gefüllt sein");
                    }
                    if (TextUtils.isEmpty(rstraße)) {
                        RStraße.setError("Straße muss gefüllt sein");
                    }
                    if (TextUtils.isEmpty(rhausnr)) {
                        RHausNr.setError("Hausnummer muss gefüllt sein");
                    }
                    if (TextUtils.isEmpty(rort)) {
                        ROrt.setError("Ort muss gefüllt sein");
                    }
                    if (TextUtils.isEmpty(rplz)) {
                        Rplz.setError("PLZ muss gefüllt sein");
                    }
                    if (TextUtils.isEmpty(rvon)) {
                        RVon.setError("Von muss gefüllt sein");
                    }
                    if (TextUtils.isEmpty(rbis)) {
                        RBis.setError("Bis muss gefüllt sein");
                    }
                    if (TextUtils.isEmpty(rtelefon)) {
                        RTelefon.setError("Telefonnummer muss gefüllt sein");
                    } else {

                        if (!TextUtils.isEmpty(rlink) && !TextUtils.isEmpty(rbild)) {
                            //neues Restaurant anlegen + Link und Bild gefüllt
                            Restaurants restaurants = new Restaurants(rid, rname, rdoener, rpizza, ritalian, rasian, rsteak, rburger, rbaguette, rsalad, rfish, rstraße, rhausnr, rplz, rort, rtelefon, rvon, rbis, rlink, rbild);


                            AdminHome.restaurantDatabase.dao().addRestaurant(restaurants);
                            Toast.makeText(getContext(), "Restaurant added", Toast.LENGTH_SHORT).show();
                        }
                        if (TextUtils.isEmpty(rlink) && !TextUtils.isEmpty(rbild)) {
                            //neues Restaurant anlegen + nur Bild gefüllt
                            String elink = "Kein Link vorhanden";
                            Restaurants restaurants = new Restaurants(rid, rname, rdoener, rpizza, ritalian, rasian, rsteak, rburger, rbaguette, rsalad, rfish, rstraße, rhausnr, rplz, rort, rtelefon, rvon, rbis, elink, rbild);


                            AdminHome.restaurantDatabase.dao().addRestaurant(restaurants);
                            Toast.makeText(getContext(), "Restaurant added", Toast.LENGTH_SHORT).show();
                        }
                        if (!TextUtils.isEmpty(rlink) && TextUtils.isEmpty(rbild)) {
                            //neues Restaurant anlegen + nur Link gefüllt
                            String ebild = "keine_speisekarte";
                            Restaurants restaurants = new Restaurants(rid, rname, rdoener, rpizza, ritalian, rasian, rsteak, rburger, rbaguette, rsalad, rfish, rstraße, rhausnr, rplz, rort, rtelefon, rvon, rbis, rlink, ebild);


                            AdminHome.restaurantDatabase.dao().addRestaurant(restaurants);
                            Toast.makeText(getContext(), "Restaurant added", Toast.LENGTH_SHORT).show();
                        } else {
                            //neues REstaurant anlegen + Bild und Link nicht gefüllt
                            String ebild = "keine_speisekarte";
                            String elink = "Kein Link vorhanden";
                            Restaurants restaurants = new Restaurants(rid, rname, rdoener, rpizza, ritalian, rasian, rsteak, rburger, rbaguette, rsalad, rfish, rstraße, rhausnr, rplz, rort, rtelefon, rvon, rbis, elink, ebild);


                            AdminHome.restaurantDatabase.dao().addRestaurant(restaurants);
                            Toast.makeText(getContext(), "Restaurant added", Toast.LENGTH_SHORT).show();
                        }


                        //Inhalte der Variablen löschen
                        RId.setText("");
                        RName.setText("");
                        RStraße.setText("");
                        RHausNr.setText("");
                        RTelefon.setText("");
                        RVon.setText("");
                        RBis.setText("");
                        RDoener.setChecked(false);
                        RPizza.setChecked(false);
                        RItalian.setChecked(false);
                        RAsian.setChecked(false);
                        RSteak.setChecked(false);
                        RBurger.setChecked(false);
                        RBaguette.setChecked(false);
                        RSalad.setChecked(false);
                        RFish.setChecked(false);
                        RLink.setText("");
                        RBild.setText("");

                    }

                }catch (Exception e){
                    Toast.makeText(getContext(),"Fehler. Restaurant ID ist bereits vorhanden", Toast.LENGTH_LONG).show();
                    int irid = Integer.parseInt(rid);
                    int jrid = irid + 1;
                    String srid = String.valueOf(jrid);
                    RId.setText(srid);
                }

            }

        });

        return view;
    }

}