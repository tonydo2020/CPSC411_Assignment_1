package com.csfu.cpsc4102.testapplication;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ScrollView;

public class ScrollabelLinearActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //

        HorizontalScrollView sv = new HorizontalScrollView(this);

        LinearLayout lv = new LinearLayout(this);
        lv.setOrientation(LinearLayout.VERTICAL);

        for (int i = 0; i <= 20; i++) {
            TextView tv = new TextView(this);
            tv.setText("String " + i);
            tv.setTextSize(24);
            tv.setBackgroundColor(Color.YELLOW);
            lv.addView(tv);
        }

        sv.addView(lv); // passes our linear view object into our scroll view object
        setContentView(lv);
    }

}
