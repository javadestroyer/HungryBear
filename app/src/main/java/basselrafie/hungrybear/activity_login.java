package basselrafie.hungrybear;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class activity_login extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int counter = 5;
    private TextView Credits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Name = findViewById(R.id.etName);
        Password = findViewById(R.id.etPassword);
        Info = findViewById(R.id.tvInfo);
        Login = findViewById(R.id.btnLogin);
        Info.setText("No of attempts remaining: 5");
        Credits = findViewById(R.id.Credits);
        Credits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCreditsActivity();
            }
        });
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });

    }
    public void openCreditsActivity() {
        Intent intent2 = new Intent(this, CreditsActivity.class);
        startActivity(intent2);
    }



    private void validate(String userName, String userPassword) {

        if ((userName.equals("Admin")) && (userPassword.equals("1234"))) {
            Intent intent = new Intent(activity_login.this, AdminHome.class);
            startActivity(intent);
        } else {
            counter--;

            Info.setText(" No of attemtps remaining: " + String.valueOf(counter));

            if (counter == 0) {

                Login.setEnabled(false);
            }
        }

    }
}