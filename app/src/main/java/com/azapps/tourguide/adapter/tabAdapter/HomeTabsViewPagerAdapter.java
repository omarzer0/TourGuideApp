package com.azapps.tourguide.adapter.tabAdapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.azapps.tourguide.R;
import com.azapps.tourguide.ui.CafeteriasFragment;
import com.azapps.tourguide.ui.HistoricalFragment;
import com.azapps.tourguide.ui.RestaurantsFragment;
import com.azapps.tourguide.ui.StadiumsFragment;

public class HomeTabsViewPagerAdapter extends FragmentPagerAdapter {

    private static final int[] TAB_TITLES = new int[]{R.string.historical,R.string.restaurant
            ,R.string.stadium,R.string.cafeteria};
    private Context context;

    public HomeTabsViewPagerAdapter(@NonNull FragmentManager fm, int behavior, Context context) {
        super(fm, behavior);
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = HistoricalFragment.newInstance();
                break;
            case 1:
                fragment = RestaurantsFragment.newInstance();
                break;
            case 2:
                fragment = StadiumsFragment.newInstance();
                break;
            case 3:
                fragment = CafeteriasFragment.newInstance();
                break;
        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return context.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        return TAB_TITLES.length;
    }
}
