package com.android.inputmethod.latin;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LatinImeTutorialActivity extends Activity implements
        View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.ime_tutorial_activity);

        ((Button) findViewById(R.id.next_button)).setOnClickListener(this);
        ((Button) findViewById(R.id.back_button)).setOnClickListener(this);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    public void onClick(View v) {
        int vid = v.getId();
        if (vid == R.id.back_button) {
            setResult(0);
        } else if (vid == R.id.next_button) {
            setResult(-1);
        }
        finish();
    }

}

