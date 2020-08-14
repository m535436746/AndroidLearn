package com.ming.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Hikeen on 2020/8/7.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
