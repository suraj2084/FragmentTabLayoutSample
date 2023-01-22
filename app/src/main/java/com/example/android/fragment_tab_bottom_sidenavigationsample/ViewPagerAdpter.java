package com.example.android.fragment_tab_bottom_sidenavigationsample;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdpter extends FragmentPagerAdapter {
    public ViewPagerAdpter(@NonNull FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0) {
            return new AFragment();
        }else if(position==1) {
            return new BFragment();
        }else{
            return new DFragment();
        }
    }
    @Override
    public int getCount() {
        return 3;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0){
            return "A";
        }else if(position==1){
            return "B";
        }else  {
            return "D";
        }
    }
}
