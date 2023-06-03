package com.example.bondanss.adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.bondanss.Detail;
import com.example.bondanss.model.ItemModel;
import com.example.bondanss.R;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<ItemModel> {

    public ItemAdapter(@NonNull Context context, ArrayList<ItemModel> courseModelArrayList) {
        super(context, 0, courseModelArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listitemView = convertView;
        if (listitemView == null) {
            // Layout Inflater inflates each item to be displayed in GridView.
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.card, parent, false);
        }

        ItemModel courseModel = getItem(position);
        TextView nama = listitemView.findViewById(R.id.nama);
        TextView harga = listitemView.findViewById(R.id.harga);
        LinearLayout action = listitemView.findViewById(R.id.action);
        ImageView courseIV = listitemView.findViewById(R.id.idIVcourse);

        nama.setText(courseModel.getNama());
        harga.setText(courseModel.getHarga());
        courseIV.setImageResource(courseModel.getImgid());



        // Attach the click event handler
        action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Access the row position here to get the correct data item
                // Do what you want here...
                Intent i = new Intent(getContext(), Detail.class);
                i.putExtra("item",courseModel);
                getContext().startActivity(i);
            }
        });

        return listitemView;
    }
}
