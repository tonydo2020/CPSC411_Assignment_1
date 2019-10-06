package com.csfu.cpsc4102.testapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.ColorUtils;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.graphics.Typeface;

import java.util.concurrent.CopyOnWriteArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);

      LinearLayout main = new LinearLayout(this);
      ViewGroup.LayoutParams llParams = new ViewGroup.LayoutParams(
              ViewGroup.LayoutParams.WRAP_CONTENT,
              ViewGroup.LayoutParams.WRAP_CONTENT
      );
      main.setLayoutParams(llParams);
      main.setOrientation(LinearLayout.VERTICAL);


      GridLayout root = new GridLayout(this);


      LinearLayout.LayoutParams rParams = new LinearLayout.LayoutParams(llParams);

      root.setLayoutParams(rParams);
      root.setOrientation(GridLayout.HORIZONTAL);
      root.setBackgroundColor(Color.WHITE);
      root.setColumnCount(4);
      root.setRowCount(11);

      TextView tv = new TextView(this);
      tv.setText("Rule void hello1(int hour)");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.BLACK);
      tv.setTextColor(Color.WHITE);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

      GridLayout.Spec row_spec = GridLayout.spec(0,1f);
      GridLayout.Spec col_spec = GridLayout.spec(0,2,1f);
      GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);

      tv = new TextView(this);
      tv.setText("properties");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.WHITE);
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

      row_spec = GridLayout.spec(1,2,1f);
      col_spec = GridLayout.spec(0,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);


      tv = new TextView(this);
      tv.setText("name");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.WHITE);
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

      row_spec = GridLayout.spec(1,1f);
      col_spec = GridLayout.spec(1,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);



      tv = new TextView(this);
      tv.setText("Day Hour Classification");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.WHITE);
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);

      row_spec = GridLayout.spec(1,1f);
      col_spec = GridLayout.spec(3,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);

      tv = new TextView(this);
      tv.setText("Category");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.WHITE);
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

      row_spec = GridLayout.spec(2,1f);
      col_spec = GridLayout.spec(1,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);

      tv = new TextView(this);
      tv.setText("Day and Time");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.WHITE);
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);

      row_spec = GridLayout.spec(2,1f);
      col_spec = GridLayout.spec(3,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);

      tv = new TextView(this);
      tv.setText("Rule");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.rgb(173,216,230));
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

      row_spec = GridLayout.spec(3,1f);
      col_spec = GridLayout.spec(0,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);

      tv = new TextView(this);
      tv.setText("C1");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.rgb(173,216,230));
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

      row_spec = GridLayout.spec(3,1f);
      col_spec = GridLayout.spec(1,2,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);

      tv = new TextView(this);
      tv.setText("A1");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.rgb(173,216,230));
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

      row_spec = GridLayout.spec(3,1f);
      col_spec = GridLayout.spec(3,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);

      tv = new TextView(this);
      tv.setText("");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.rgb(173,216,230));
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

      row_spec = GridLayout.spec(4,1f);
      col_spec = GridLayout.spec(0,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);

      tv = new TextView(this);
      tv.setText("min <= hour && hour <= max");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.rgb(173,216,230));
      tv.setTextColor(Color.BLACK);

      row_spec = GridLayout.spec(4,1f);
      col_spec = GridLayout.spec(2,2,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);


      tv = new TextView(this);
      tv.setText("System.out.println(greeting + , World!");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.rgb(173,216,230));
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

      row_spec = GridLayout.spec(4,1f);
      col_spec = GridLayout.spec(3,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);

      tv = new TextView(this);
      tv.setText("");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.rgb(173,216,230));
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

      row_spec = GridLayout.spec(5,1f);
      col_spec = GridLayout.spec(0,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);

      root.addView(tv);


      tv = new TextView(this);
      tv.setText("int min");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.rgb(173,216,230));
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

      row_spec = GridLayout.spec(5,1f);
      col_spec = GridLayout.spec(1,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);


      setContentView(root);
    }
}
