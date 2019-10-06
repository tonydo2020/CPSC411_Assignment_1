package com.csfu.cpsc4102.testapplication;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
public class Dynamic0926Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.dynamic_content);

        LinearLayout llview = (LinearLayout) findViewById(R.id.llayoutId);
        llview.setBackgroundColor(Color.YELLOW);

        // Inflate the second layout resource file
        LayoutInflater inflater = LayoutInflater.from(this);
        TextView tvview_2 = (TextView) inflater.inflate(R.layout.additional_textview,
            llview, false);
        tvview_2.setBackgroundColor(Color.CYAN);
        tvview_2.setTextSize(28);
        llview.addView(tvview_2);

        TextView tvview = findViewById(R.id.tvviewID);
        tvview.setText("Update String");
        tvview.setBackgroundColor(Color.GREEN);
    }
}
