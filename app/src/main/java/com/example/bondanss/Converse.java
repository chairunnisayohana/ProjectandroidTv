package com.example.bondanss;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bondanss.adapter.ItemAdapter;
import com.example.bondanss.model.ItemModel;

import java.util.ArrayList;

public class Converse  extends AppCompatActivity {

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

        males.add(new ItemModel("Converse Chuck Flyease CX BL Game Royal","IDR 800.000", getResources().getIdentifier("converse_male_1", "drawable", getPackageName())));
        males.add(new ItemModel("Converse One Star Pro Leather White","IDR 850.000", getResources().getIdentifier("converse_male_2", "drawable", getPackageName())));
        males.add(new ItemModel("Converse Chuck Taylor All-Star High Black","IDR 900.000", getResources().getIdentifier("converse_male_3", "drawable", getPackageName())));

        females.add(new ItemModel("Converse All-Star 70's Shaniqwa Jarvis Floral","IDR 950.000", getResources().getIdentifier("converse_female_1", "drawable", getPackageName())));
        females.add(new ItemModel("Converse Weapon CX Mid Vintage White","IDR 1.065.000", getResources().getIdentifier("converse_female_2", "drawable", getPackageName())));
        females.add(new ItemModel("Converse Run Star High Top Pink","IDR 1.300.000", getResources().getIdentifier("converse_female_3", "drawable", getPackageName())));

        kidss.add(new ItemModel("Converse One Star Pro Ox Sean Pablo Rapid Teal","IDR 800.000", getResources().getIdentifier("converse_kids_1", "drawable", getPackageName())));
        kidss.add(new ItemModel("Converse All-Star 70's Ox Pigalle Multi","IDR 2.150.000", getResources().getIdentifier("converse_kids_2", "drawable", getPackageName())));
        kidss.add(new ItemModel("Converse All-Star Desert rave (W)","IDR 950.000", getResources().getIdentifier("converse_kids_3", "drawable", getPackageName())));

        ItemAdapter adapter1 = new ItemAdapter(this, males);
        male.setAdapter(adapter1);

        ItemAdapter adapter2 = new ItemAdapter(this, females);
        female.setAdapter(adapter2);

        ItemAdapter adapter3 = new ItemAdapter(this, kidss);
        kids.setAdapter(adapter3);
    }
}
