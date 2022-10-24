package com.example.pmdm_2223.ejtaxi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.pmdm_2223.R;

public class recibe extends AppCompatActivity {
    TextView nombrer,dnir,fi,hi,fv,hv,recogidar,ciudadr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibe);

        nombrer=findViewById(R.id.nombrer);
        dnir=findViewById(R.id.dnir);
        recogidar=findViewById(R.id.recogidar);
        fv=findViewById(R.id.fv);
        hv=findViewById(R.id.hv);
        fi=findViewById(R.id.fi);
        hi=findViewById(R.id.hi);
        ciudadr=findViewById(R.id.ciudadr);



        Intent i2 = getIntent();
        nombrer.setText(i2.getStringExtra("nombre"));
        dnir.setText(i2.getStringExtra("dni"));
        recogidar.setText(i2.getStringExtra("recogida"));
        fi.setText(i2.getStringExtra("fechaIda"));
        hi.setText(i2.getStringExtra("horaIda"));
        fv.setText(i2.getStringExtra("fechaVuelta"));
        hv.setText(i2.getStringExtra("horaVuelta"));
        ciudadr.setText(i2.getStringExtra("ciudad"));

    }
}