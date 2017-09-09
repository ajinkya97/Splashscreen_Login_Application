package com.example.aj.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username,password;
    Button login;

    String u="ajinkya";
    String p="123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=(EditText)findViewById(R.id.user);
        password=(EditText)findViewById(R.id.pass);
        login=(Button)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String us=username.getText().toString();
                String pa=password.getText().toString();
                if(us.equals(u)&& pa.equals(p))
                {
                    Toast.makeText(MainActivity.this, "Login Successfull", Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(MainActivity.this,profile.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Login Unsuccessfull", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
