package com.example.mvpapp.Login.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mvpapp.Login.presenter.LoginPresenter;
import com.example.mvpapp.R;

public class MainActivity extends AppCompatActivity {
EditText username,password;
Button login;
String user,pass;
View view;
LoginPresenter loginp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

username=(EditText) findViewById(R.id.username);
password=(EditText) findViewById((R.id.password));
login=(Button) findViewById(R.id.loginbutton);
        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                user = username.getText().toString().trim();
                pass = password.getText().toString().trim();
                if (user.isEmpty() || pass.isEmpty()) {
                    Log.d("empty", "Cant be empty");
                }


                else {
                    loginp.sendLoginData();
                }





            }

        });




            }

public void LoginSuccess(){
    Log.d("empty", "Login Succesfull");
}
public void LoginFailiure(){
    Log.d("empty", "Login Failed");
}
}