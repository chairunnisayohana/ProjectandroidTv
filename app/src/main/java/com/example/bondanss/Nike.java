package com.example.bondanss;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bondanss.adapter.ItemAdapter;
import com.example.bondanss.model.ItemModel;

import java.util.ArrayList;

public class Nike  extends AppCompatActivity {

    GridView male,female,kids;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_data);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);


        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        kids = findViewById(R.id.kids);
        ArrayList<ItemModel> males = new ArrayList<ItemModel>();
        ArrayList<ItemModel> females = new ArrayList<ItemModel>();
        ArrayList<ItemModel> kidss = new ArrayList<ItemModel>();

        males.add(new ItemModel("Nike Dunk Low Setsubun","IDR 2.600.000", getResources().getIdentifier("adidas_male_1", "drawable", getPackageName())));
        males.add(new ItemModel("Nike Dunk Low Gorge Green","IDR 1.600.000", getResources().getIdentifier("adidas_male_2", "drawable", getPackageName())));
        males.add(new ItemModel("Nike Dunk Low White Black","IDR 1.500.000", getResources().getIdentifier("adidas_male_3", "drawable", getPackageName())));

        females.add(new ItemModel("Nike Air Dunk Low Essential Paisley","IDR 1.550.000", getResources().getIdentifier("adidas_female_1", "drawable", getPackageName())));
        females.add(new ItemModel("Nike Air Force 1 Low '07","IDR 1.300.000", getResources().getIdentifier("adidas_female_2", "drawable", getPackageName())));
        females.add(new ItemModel("Nike Air Force 1 Low White Pink","IDR 1.350.000", getResources().getIdentifier("adidas_female_3", "drawable", getPackageName())));

        kidss.add(new ItemModel("Nike Waffle One Black White","IDR 1.050.000", getResources().getIdentifier("adidas_kids_1", "drawable", getPackageName())));
        kidss.add(new ItemModel("Nike Air Force 1 Low Billie Ellish","IDR 2.800.000", getResources().getIdentifier("adidas_kids_2", "drawable", getPackageName())));
        kidss.add(new ItemModel("Nike Waffle Debut Black ","IDR 1.100.000", getResources().getIdentifier("adidas_kids_3", "drawable", getPackageName())));

        ItemAdapter adapter1 = new ItemAdapter(this, males);
        male.setAdapter(adapter1);

        ItemAdapter adapter2 = new ItemAdapter(this, females);
        female.setAdapter(adapter2);

        ItemAdapter adapter3 = new ItemAdapter(this, kidss);
        kids.setAdapter(adapter3);
    }
}
