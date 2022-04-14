package com.example.tablayoutusingviewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
ViewPager viewPager;
MyAdapter myAdapter;
TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=findViewById(R.id.viewpager);
        tabLayout=findViewById(R.id.tablayout);
        myAdapter=new MyAdapter(getSupportFragmentManager());
        myAdapter.add();
        viewPager.setAdapter(myAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}