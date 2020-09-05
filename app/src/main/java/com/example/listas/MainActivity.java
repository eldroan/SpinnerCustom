package com.example.listas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner miSpinnerCopado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miSpinnerCopado = (Spinner) findViewById(R.id.spinner);

        ArrayList<SpinnerItemModel> items = new ArrayList<>();
        items.add( new SpinnerItemModel("Harry Potter", R.drawable.pochoclo));
        items.add( new SpinnerItemModel("La naranja mecanica", R.drawable.pochoclo));
        items.add( new SpinnerItemModel("Avengers", R.drawable.pochoclo));
        items.add( new SpinnerItemModel("Star Wars", R.drawable.pochoclo));
        items.add( new SpinnerItemModel("Scott Pilgrim", R.drawable.pochoclo));
        items.add( new SpinnerItemModel("El padrino", R.drawable.pochoclo));

        SpinnerItemAdapter adapter = new SpinnerItemAdapter(this,items);
        miSpinnerCopado.setAdapter(adapter);

        miSpinnerCopado.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}