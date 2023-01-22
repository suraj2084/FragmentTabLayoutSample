package com.example.android.fragment_tab_bottom_sidenavigationsample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tab;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tab=findViewById(R.id.tab);
        viewPager=findViewById(R.id.viewpager);
        Log.d("Hello","Pass1");
        ViewPagerAdpter viewPagerAdpter=new ViewPagerAdpter(getSupportFragmentManager());
        Log.d("Hello","Pass2");
        viewPager.setAdapter(viewPagerAdpter);
        Log.d("Hello","Pass3");
        tab.setupWithViewPager(viewPager);
    }
}