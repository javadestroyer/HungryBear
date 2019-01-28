package basselrafie.hungrybear;

import android.arch.persistence.room.Room;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import android.content.Context;

public class PizzaView extends AppCompatActivity {

    public static FragmentManager fragmentManager;
    public static RestaurantDatabase restaurantDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_view);




        fragmentManager = getSupportFragmentManager();
        restaurantDatabase = Room.databaseBuilder(getApplicationContext(),RestaurantDatabase.class, "restaurantdb").allowMainThreadQueries().build();

        if(findViewById(R.id.fragment_container)!=null)
        {
            if(savedInstanceState!=null)
            {
                return;
            }
            for (int i=0; i<=MainActivity.categories.size();i++){
                if (MainActivity.categories.get(i).getPizza()==true){
                    Log.d("test", "This is my message");
                    Context context = getApplicationContext();
                    CharSequence text = MainActivity.categories.get(i).getRestaurantName();
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
            fragmentManager.beginTransaction().add(R.id.fragment_container, new PizzaFragment()).commit();
        }

    }
}