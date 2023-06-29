package com.example.baicuoiky.Activity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.baicuoiky.Adapter.MainViewPagerAdapter;
import com.example.baicuoiky.Fragment.Fragment_TrangChu;
import com.example.baicuoiky.Fragment.Fragment_timkiem;
import com.example.baicuoiky.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTablayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       mTablayout =  findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.viewPager);

        MainViewPagerAdapter mainViewPagerAdapter = new MainViewPagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(mainViewPagerAdapter);

        mTablayout.setupWithViewPager(viewPager);
        mTablayout.getTabAt(0) .setIcon(R.drawable.icon_home);
        mTablayout.getTabAt(1) .setIcon(R.drawable.icon_search);


    }
}