package com.example.baicuoiky.Adapter;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.baicuoiky.Fragment.Fragment_TrangChu;
import com.example.baicuoiky.Fragment.Fragment_timkiem;

public class MainViewPagerAdapter extends FragmentStatePagerAdapter{

    public MainViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
            return new Fragment_TrangChu();
            case 1:
                return new Fragment_timkiem();

            default:
                return new Fragment_TrangChu();

        }

    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title = "Trang chủ";

                break;

            case 1:
                title = "Tìm Kiếm";
                break;

        }
        return title;
    }


}