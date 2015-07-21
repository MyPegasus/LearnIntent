package com.example.mypegasus.learnintent;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Administrator on 2015/7/22 0022.
 */
public class MyActivity extends Activity {

    public static final String Action = "com.example.mypegasus.learnintent.intent.action.MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }
}
