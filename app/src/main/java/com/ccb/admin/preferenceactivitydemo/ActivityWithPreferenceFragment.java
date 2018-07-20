package com.ccb.admin.preferenceactivitydemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class ActivityWithPreferenceFragment  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preference);
        getFragmentManager().beginTransaction().replace(R.id.fl,new MyFragment()).commit();
    }





}
