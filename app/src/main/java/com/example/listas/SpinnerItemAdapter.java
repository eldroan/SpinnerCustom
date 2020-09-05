package com.example.listas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class SpinnerItemAdapter extends ArrayAdapter<SpinnerItemModel> {
    private Context context;
    private List<SpinnerItemModel> spinnerItems;

    public SpinnerItemAdapter(@NonNull Context context, @NonNull List<SpinnerItemModel> objects) {
        super(context, 0, objects);
        this.context = context;
        this.spinnerItems = objects;
    }


    @NonNull
    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View item = convertView;
        if(item == null){
            //Hay que inflarlo
            item = LayoutInflater.from(context).inflate(R.layout.spinner_item_layout,parent,false);
        }

        SpinnerItemModel selected = spinnerItems.get(position);

        ImageView image = item.findViewById(R.id.imageView);
        TextView text = item.findViewById(R.id.textView);

        image.setImageResource(selected.getImagen());
        text.setText(selected.getTitulo());

        return item;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View item = convertView;
        if(item == null){
            //Hay que inflarlo
            item = LayoutInflater.from(context).inflate(R.layout.spinner_item_layout,parent,false);
        }

        SpinnerItemModel selected = spinnerItems.get(position);

        ImageView image = item.findViewById(R.id.imageView);
        TextView text = item.findViewById(R.id.textView);

        image.setImageResource(selected.getImagen());
        text.setText(selected.getTitulo());

        return item;
    }
}
