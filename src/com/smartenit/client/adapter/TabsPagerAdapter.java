package com.smartenit.client.adapter;


import com.smartenit.client.AreasFragment;
import com.smartenit.client.ScenesFragment;
import com.smartenit.client.WizardsFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
 
public class TabsPagerAdapter extends FragmentPagerAdapter {
 
    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }
 
    @Override
    public Fragment getItem(int index) {
 
        switch (index) {
        case 0:
            // Areas fragment activity
            return new AreasFragment();
        case 1:
            // Wizards fragment activity
            return new WizardsFragment();
        case 2:
            // Scenes fragment activity
            return new ScenesFragment();
        }
 
        return null;
    }
 
    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 3;
    }
 
}
