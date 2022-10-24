package com.example.pmdm_2223.ejtaxi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.ToggleButton;

import com.example.pmdm_2223.R;

public class inicio extends AppCompatActivity {

    EditText fechaIda,horaIda,fechaVuelta,horaVuelta,nombre,dni,recogida;
    Button enviar;
    Spinner ciudades;
    ToggleButton ida2;
    String c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        fechaIda=findViewById(R.id.fechaIda);
        horaIda=findViewById(R.id.horaIda);
        fechaVuelta=findViewById(R.id.fechaVuelta);
        horaVuelta=findViewById(R.id.horaVuelta);
        nombre=findViewById(R.id.nombre);
        dni=findViewById(R.id.dni);
        recogida=findViewById(R.id.recogida);
        enviar=findViewById(R.id.enviar);
        ida2=(ToggleButton)findViewById(R.id.ida2);

        fechaVuelta.setVisibility(View.GONE);
        horaVuelta.setVisibility(View.GONE);

        ida2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ida2.isChecked()){
                    fechaVuelta.setVisibility(View.VISIBLE);
                    horaVuelta.setVisibility(View.VISIBLE);
                }else{
                    fechaVuelta.setVisibility(View.GONE);
                    horaVuelta.setVisibility(View.GONE);
                }
            }
        });

        //ciudades
        ciudades= (Spinner) findViewById(R.id.ciudades);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.ciudades, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ciudades.setAdapter(adapter);


        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lanzar();

            }
        });


    }
    private void lanzar() {
        Intent i = new Intent(this, recibe.class);
        i.putExtra("ciudad",ciudades.getSelectedItem().toString());
        i.putExtra("fechaIda", fechaIda.getText().toString());
        i.putExtra("horaIda",horaIda.getText().toString());
        i.putExtra("fechaVuelta", fechaVuelta.getText().toString());
        i.putExtra("horaVuelta", horaVuelta.getText().toString());
        i.putExtra("nombre", nombre.getText().toString());
        i.putExtra("dni", dni.getText().toString());
        i.putExtra("recogida", recogida.getText().toString());
        startActivity(i);

    }
}