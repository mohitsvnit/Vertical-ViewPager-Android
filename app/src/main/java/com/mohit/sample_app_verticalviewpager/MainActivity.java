package com.mohit.sample_app_verticalviewpager;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.mohit.verticalviewpager.VerticalViewPager;

public class MainActivity extends AppCompatActivity {

    public ViewPagerAdapter viewPagerAdapter;
    public VerticalViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViewPager();
    }



    public void initViewPager(){
        viewPager = (VerticalViewPager) findViewById(R.id.viewPager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);

    }


}
