package com.l19290641.myfirstaplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onbBtnIngresarTap(View view){
        EditText etUsuer1 = findViewById(R.id.etUser1);
        EditText etContraseña = findViewById(R.id.etContraseña);

        String user,pass;
        user = etUsuer1.getText().toString();
        pass = etContraseña.getText().toString();


        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        AlertDialog dialog = builder.create();
        dialog.setTitle("Felicidades presionaste el botón");
        dialog.setMessage(String.format("Datos Ingresado=\nUsuario: %s \nPassword: %s", user, pass));

        dialog.show();

    }
}