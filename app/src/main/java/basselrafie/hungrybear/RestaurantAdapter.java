package basselrafie.hungrybear;

import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.ViewHolder> {

    List<Restaurants> restaurants;
    Context context;

    public RestaurantAdapter(List<Restaurants> restaurants,Context context){
        this.restaurants = restaurants;
        this.context = context;
    }


    @NonNull
    @Override
    public RestaurantAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.restaurant_row, viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantAdapter.ViewHolder viewHolder, int i) {

        final Restaurants restaurant = restaurants.get(i);
        viewHolder.RName.setText(restaurant.getRname());
        viewHolder.RTelefon.setText(restaurant.getRtelefon());
        viewHolder.RAdresse.setText(restaurant.getRstraße() + " " + restaurant.getRhausnr() + ", " + restaurant.getRplz() + " " + restaurant.getRort());

        viewHolder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, DisplayRestaurant.class);
                String rid = String.valueOf(restaurant.getRid());
                String rname = restaurant.getRname();
                String rstraße = restaurant.getRstraße();
                String rhausnr = restaurant.getRhausnr();
                String rplz = restaurant.getRplz();
                String rort = restaurant.getRort();
                String rtelefon = restaurant.getRtelefon();
                String rvon = restaurant.getRvon();
                String rbis = restaurant.getRbis();
                String rlink = restaurant.getRlink();
                String rbild = restaurant.getRbild();

                i.putExtra("RId", rid);
                i.putExtra("RName", rname);
                i.putExtra("RStraße", rstraße);
                i.putExtra("RHausNr", rhausnr);
                i.putExtra("Rplz", rplz);
                i.putExtra("Rort", rort);
                i.putExtra("RTelefon", rtelefon);
                i.putExtra("RVon", rvon);
                i.putExtra("RBis", rbis);
                i.putExtra("RLink", rlink);
                i.putExtra("RBild", rbild);

                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return restaurants.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView RName, RTelefon,RAdresse;
        public RelativeLayout relativeLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            RName = itemView.findViewById(R.id.text_rname);
            RTelefon = itemView.findViewById(R.id.text_rtelefon);
            RAdresse = itemView.findViewById(R.id.text_radresse);
            relativeLayout = itemView.findViewById(R.id.relativeLayout);

        }
    }
}
