package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {


    RadioButton rbMALE,rbFemale;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbMALE=findViewById(R.id.rb_male);
        rbFemale=findViewById(R.id.rb_female);
        btnSubmit=findViewById(R.id.btn_submit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (rbMALE.isChecked()) {
                    Toasty.success(MainActivity.this, "You Select Male", Toast.LENGTH_SHORT).show();
                }

                else {

                    Toasty.error(MainActivity.this, "You Select Female", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}