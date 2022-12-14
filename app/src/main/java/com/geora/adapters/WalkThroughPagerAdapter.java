package com.geora.adapters;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.geora.ui.walkthrough.WalkThroughFirstFragment;


/**
 * Extending FragmentStatePagerAdapter
 */

public class WalkThroughPagerAdapter extends FragmentStatePagerAdapter {

    int tabCount;

    public WalkThroughPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {

            case 0:
                WalkThroughFirstFragment tab1 = new WalkThroughFirstFragment();
                return tab1;
            case 1:
                WalkThroughFirstFragment tab2 = new WalkThroughFirstFragment();
                return tab2;
            case 2:
                WalkThroughFirstFragment tab3 = new WalkThroughFirstFragment();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getItemPosition(Object object) {
        return tabCount;
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}