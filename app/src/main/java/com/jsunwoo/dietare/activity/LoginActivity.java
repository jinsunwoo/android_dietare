package com.jsunwoo.dietare.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.jsunwoo.dietare.R;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText id = findViewById(R.id.editText_id);
        final EditText pw = findViewById(R.id.editText_pw);
        TextView findID = findViewById(R.id.findID);
        TextView findPW = findViewById(R.id.findPW);
        Button logIn = findViewById(R.id.button_login);
        Button signUp = findViewById(R.id.button_signUp);

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String arbiID = "abc";
                String arbiPW = "1234";

                if (!id.getText().toString().equals(arbiID)){
                    Toast.makeText(LoginActivity.this, "Wrong ID",Toast.LENGTH_SHORT).show();
                } else if (!pw.getText().toString().equals(arbiPW)){
                    Toast.makeText(LoginActivity.this, "Wrong PW",Toast.LENGTH_SHORT).show();
                }else{
                    Intent moveIntent = new Intent(LoginActivity.this,HomeActivity.class);
                    startActivity(moveIntent);
                }

            }
        });
    }
}
