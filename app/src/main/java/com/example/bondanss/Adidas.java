package com.example.bondanss;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bondanss.adapter.ItemAdapter;
import com.example.bondanss.model.ItemModel;

import java.util.ArrayList;

public class Adidas extends AppCompatActivity {

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

        males.add(new ItemModel("Adidas Forum 84 High Shoes","IDR 2.200.000", getResources().getIdentifier("adidas_male_1", "drawable", getPackageName())));
        males.add(new ItemModel("Adidas Forum 84 Low AEC","IDR 2.300.000", getResources().getIdentifier("adidas_male_2", "drawable", getPackageName())));
        males.add(new ItemModel("Adidas Ultraboost","IDR 3.300.000", getResources().getIdentifier("adidas_male_3", "drawable", getPackageName())));

        females.add(new ItemModel("Adidas Forum Low Shoes","IDR 1.700.000", getResources().getIdentifier("adidas_female_1", "drawable", getPackageName())));
        females.add(new ItemModel("Adidas Forum 84 low","IDR 1.800.000", getResources().getIdentifier("adidas_female_2", "drawable", getPackageName())));
        females.add(new ItemModel("Adidas UltraBoost","IDR 1.700.000", getResources().getIdentifier("adidas_female_3", "drawable", getPackageName())));

        kidss.add(new ItemModel("Adidas Gazelle Shoes","IDR 1.100.000", getResources().getIdentifier("adidas_kids_1", "drawable", getPackageName())));
        kidss.add(new ItemModel("Adidas Kids Runfalcon","IDR 1.100.000", getResources().getIdentifier("adidas_kids_2", "drawable", getPackageName())));
        kidss.add(new ItemModel("Adidas Kids Superstar","IDR 1.100.000", getResources().getIdentifier("adidas_kids_3", "drawable", getPackageName())));

        ItemAdapter adapter1 = new ItemAdapter(this, males);
        male.setAdapter(adapter1);

        ItemAdapter adapter2 = new ItemAdapter(this, females);
        female.setAdapter(adapter2);

        ItemAdapter adapter3 = new ItemAdapter(this, kidss);
        kids.setAdapter(adapter3);
    }
}
