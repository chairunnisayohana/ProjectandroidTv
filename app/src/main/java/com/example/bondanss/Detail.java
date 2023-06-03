package com.example.bondanss;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bondanss.adapter.ItemAdapter;
import com.example.bondanss.model.ItemModel;

import java.util.ArrayList;

public class Detail extends AppCompatActivity {

    GridView male,female,kids;
    ItemModel item;
    ImageView imageView;
    TextView textView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);


        Bundle extras = getIntent().getExtras();
        item = (ItemModel) extras.get("item");
        imageView = findViewById(R.id.imageView);
        textView5 = findViewById(R.id.textView5);
        textView5.setText(item.getNama());
        imageView.setImageResource(item.getImgid());
    }

}
