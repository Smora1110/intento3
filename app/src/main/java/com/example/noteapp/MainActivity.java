package com.example.noteapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private CardView cardView7,cardView5,cardView3,cardView;
    private ImageView iv_logo;
    private EditText et_user,et_contraseña;
    private Button bt_ingresar,bt_registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);

        et_user = findViewById(R.id.et_user);
        et_contraseña = findViewById(R.id.et_contraseña);
        bt_ingresar = findViewById(R.id.bt_ingresar);
        bt_registrar = findViewById(R.id.bt_registrar);

    }




}