package com.vanhitech.vanhitech.cropview;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.vanhitech.vanhitech.R;
import com.vanhitech.vanhitech.base.MyApplication;


public class ResultActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // apply custom font
        FontUtils.setFont((ViewGroup)findViewById(R.id.layout_root));
        // get cropped bitmap from Application
        Bitmap cropped = ((MyApplication)getApplication()).cropped;
        // set cropped bitmap to ImageView
        ((ImageView)findViewById(R.id.result_image)).setImageBitmap(cropped);
    }
}
