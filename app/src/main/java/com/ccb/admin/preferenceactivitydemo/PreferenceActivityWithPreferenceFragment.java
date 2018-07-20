package com.ccb.admin.preferenceactivitydemo;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.annotation.Nullable;

import java.util.List;

/**
 * @Author liuhailin
 * Created by zz on 2018/7/20 17:44.
 * 　　class explain:
 * 　　　　update:       upAuthor:      explain:
 */

public class PreferenceActivityWithPreferenceFragment  extends AppCompatPreferenceActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onBuildHeaders(List<Header> target) {
        //加载选项列表布局
        loadHeadersFromResource(R.xml.layout,target);
    }

    @Override
    protected boolean isValidFragment(String fragmentName) {
        return true;
    }
    public static class GeneralPerenceFragment extends PreferenceFragment {
        @Override
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.pref_general);
        }
    }
}

