package com.ccb.admin.preferenceactivitydemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;


/**
 * @Author liuhailin
 * Created by zz on 2018/7/20 17:03.
 * 　　class explain:
 * 　　　　update:       upAuthor:      explain:
 */

public class MainActivity extends Activity implements View.OnClickListener {



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt1 = findViewById(R.id.button1);
        Button  bt2 = findViewById(R.id.button2);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                startActivity(new Intent(this,ActivityWithPreferenceFragment.class));
                break;
            case R.id.button2:
                startActivity(new Intent(this,PreferenceActivityWithPreferenceFragment.class));
                break;
        }


    }
}
