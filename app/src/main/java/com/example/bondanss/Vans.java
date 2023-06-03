package com.example.bondanss;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bondanss.adapter.ItemAdapter;
import com.example.bondanss.model.ItemModel;

import java.util.ArrayList;

public class Vans  extends AppCompatActivity {

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

        males.add(new ItemModel("Vans Old Skool Black white","IDR 800.000", getResources().getIdentifier("vans_male_1", "drawable", getPackageName())));
        males.add(new ItemModel("Vans Classic Slip on Checker","IDR 650.000", getResources().getIdentifier("vans_male_2", "drawable", getPackageName())));
        males.add(new ItemModel("Vans SK-8 Hi Black White","IDR 900.000", getResources().getIdentifier("vans_male_3", "drawable", getPackageName())));

        females.add(new ItemModel("Vans Skool True White","IDR 1.150.000", getResources().getIdentifier("vans_female_1", "drawable", getPackageName())));
        females.add(new ItemModel("Vans Authentic","IDR 600.000", getResources().getIdentifier("vans_female_2", "drawable", getPackageName())));
        females.add(new ItemModel("Vans Vault OG","IDR 750.000", getResources().getIdentifier("vans_female_3", "drawable", getPackageName())));

        kidss.add(new ItemModel("Vans Style 98 Checkboard","IDR 720.000", getResources().getIdentifier("vans_kids_1", "drawable", getPackageName())));
        kidss.add(new ItemModel("Vans Era Checker Evo","IDR 540.000", getResources().getIdentifier("vans_kids_2", "drawable", getPackageName())));
        kidss.add(new ItemModel("Vans Era Black ","IDR 650.000", getResources().getIdentifier("vans_kids_3", "drawable", getPackageName())));

        ItemAdapter adapter1 = new ItemAdapter(this, males);
        male.setAdapter(adapter1);

        ItemAdapter adapter2 = new ItemAdapter(this, females);
        female.setAdapter(adapter2);

        ItemAdapter adapter3 = new ItemAdapter(this, kidss);
        kids.setAdapter(adapter3);
    }
}
