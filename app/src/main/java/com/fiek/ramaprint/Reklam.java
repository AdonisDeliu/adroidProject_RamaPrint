package com.fiek.ramaprint;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Reklam extends AppCompatActivity {

    ViewPager viewPager;
    Adapteri adapteri;
    List<Modeli> models;
    Integer[] colors=null;
    ArgbEvaluator argbEvaluator=new ArgbEvaluator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reklam);

        models=new ArrayList<>();
        models.add(new Modeli(R.drawable.ramaprint3d,"RamaPrint","Shtypshkronja RamaPrint, Rahovec"));
        models.add(new Modeli(R.drawable.ramaprint3d1,"Harley House","Reklama 3D, Tapeta, Folje Vetëngjitëse për Harley House."));
        models.add(new Modeli(R.drawable.ramaprint3d2,"Euroing SHPK"," Alubond i ngjyrosur sipas ngjyrave të brendit + Reklama 3D Ndriçuese për Euroing SHPK"));
        models.add(new Modeli(R.drawable.ramaprint3d3,"Aron-Co","Restaurant, Aron-Co, Vanessa te gjitha 3D me ndriçim."));

        adapteri=new Adapteri(models,this);

        viewPager=findViewById(R.id.viewPager);
        viewPager.setAdapter(adapteri);
        viewPager.setPadding(130,0,130,0);

        Integer[] colors_temp={
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4)
        };

        colors=colors_temp;
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position <(adapteri.getCount()-1)&& position<(colors.length - 1)){
                    viewPager.setBackgroundColor(

                            (Integer) argbEvaluator.evaluate(
                                    positionOffset,
                                    colors[position],
                                    colors[position +1]
                            )
                    );
                }else{
                    viewPager.setBackgroundColor(colors[colors.length-1]);
                }
            }
            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
