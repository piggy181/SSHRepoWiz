package com.darakok.android.util;

import android.app.Activity;
import android.os.Bundle;

import com.darakok.android.util.R.layout;

public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.main);
    }
}
