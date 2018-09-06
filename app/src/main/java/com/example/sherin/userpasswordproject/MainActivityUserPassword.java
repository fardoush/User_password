package com.example.sherin.userpasswordproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityUserPassword extends AppCompatActivity {
    EditText user_name,password;
    Button login;
    TextView success;

    String user= "Jahanara";
    String pass = "123";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_user_password);
        //Find

        user_name=findViewById(R.id.userId);
        password=findViewById(R.id.passwordId);
        login=findViewById(R.id.loginId);
        success=findViewById(R.id.conformId) ;

        //On Click Button

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                selectusername();


            }
        });



    }

    private void selectusername() {

        String s1= user_name.getText().toString();
        String s2= password.getText().toString();

        if (s1.equals(user)&& s2.equals(pass)){
            success.setText("Login Successfully");
        }
        else{

            success.setText("Login Failed");

        }



    }
}
