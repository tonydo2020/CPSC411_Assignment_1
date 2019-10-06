package com.csfu.cpsc4102.testapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);


      GridLayout root = new GridLayout(this);


      ViewGroup.LayoutParams rParams = new ViewGroup.LayoutParams(
              ViewGroup.LayoutParams.WRAP_CONTENT,
              ViewGroup.LayoutParams.WRAP_CONTENT
      );

      root.setLayoutParams(rParams);
      root.setOrientation(GridLayout.HORIZONTAL);
      root.setBackgroundColor(Color.WHITE);
      root.setColumnCount(6);
      root.setRowCount(11);

      TextView tv = new TextView(this);
      tv.setText("Rule void hello1(int hour)");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.BLACK);
      tv.setTextColor(Color.WHITE);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

      GridLayout.Spec row_spec = GridLayout.spec(0,1f);
      GridLayout.Spec col_spec = GridLayout.spec(1,5,1f);
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
      col_spec = GridLayout.spec(1,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);

      tv = new TextView(this);
      tv.setText("1");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.rgb(212,208,200));
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

      row_spec = GridLayout.spec(0,1f);
      col_spec = GridLayout.spec(0,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);

      tv = new TextView(this);
      tv.setText("2");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.rgb(212,208,200));
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

      row_spec = GridLayout.spec(1,1f);
      col_spec = GridLayout.spec(0,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);



        tv = new TextView(this);
        tv.setText("3");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.rgb(212,208,200));
        tv.setTextColor(Color.BLACK);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        row_spec = GridLayout.spec(2,1f);
        col_spec = GridLayout.spec(0,1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10,10,10,10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("4");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.rgb(212,208,200));
        tv.setTextColor(Color.BLACK);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        row_spec = GridLayout.spec(3,1f);
        col_spec = GridLayout.spec(0,1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10,10,10,10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("5");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.rgb(212,208,200));
        tv.setTextColor(Color.BLACK);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        row_spec = GridLayout.spec(4,1f);
        col_spec = GridLayout.spec(0,1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10,10,10,10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("6");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.rgb(212,208,200));
        tv.setTextColor(Color.BLACK);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        row_spec = GridLayout.spec(5,1f);
        col_spec = GridLayout.spec(0,1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10,10,10,10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("7");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.rgb(212,208,200));
        tv.setTextColor(Color.BLACK);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        row_spec = GridLayout.spec(6,1f);
        col_spec = GridLayout.spec(0,1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10,10,10,10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("8");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.rgb(212,208,200));
        tv.setTextColor(Color.BLACK);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        row_spec = GridLayout.spec(7,1f);
        col_spec = GridLayout.spec(0,1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10,10,10,10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("9");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.rgb(212,208,200));
        tv.setTextColor(Color.BLACK);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        row_spec = GridLayout.spec(8,1f);
        col_spec = GridLayout.spec(0,1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10,10,10,10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("10");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.rgb(212,208,200));
        tv.setTextColor(Color.BLACK);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        row_spec = GridLayout.spec(9,1f);
        col_spec = GridLayout.spec(0,1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10,10,10,10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("11");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.rgb(212,208,200));
        tv.setTextColor(Color.BLACK);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        row_spec = GridLayout.spec(10,1f);
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
      col_spec = GridLayout.spec(2,1f);
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
      col_spec = GridLayout.spec(4,2,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);

      tv = new TextView(this);
      tv.setText("category");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.WHITE);
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

      row_spec = GridLayout.spec(2,1f);
      col_spec = GridLayout.spec(2,1f);
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
      col_spec = GridLayout.spec(4,2,1f);
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
      col_spec = GridLayout.spec(1,1f);
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
      col_spec = GridLayout.spec(2,2,1f);
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
      col_spec = GridLayout.spec(4,2,1f);
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
      col_spec = GridLayout.spec(1,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);

/*

      tv = new TextView(this);
      tv.setText("min <= hour && hour <= max");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.rgb(173,216,230));
      tv.setTextColor(Color.BLACK);

      row_spec = GridLayout.spec(4,1f);
      col_spec = GridLayout.spec(2,1f);
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
*/

      tv = new TextView(this);
      tv.setText("");
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


      tv = new TextView(this);
      tv.setText("int min");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.rgb(173,216,230));
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

      row_spec = GridLayout.spec(5,1f);
      col_spec = GridLayout.spec(2,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);

      tv = new TextView(this);
      tv.setText("int max");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.rgb(173,216,230));
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

      row_spec = GridLayout.spec(5,1f);
      col_spec = GridLayout.spec(4,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);


      tv = new TextView(this);
      tv.setText("Rule");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.WHITE);
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);

      row_spec = GridLayout.spec(6,1f);
      col_spec = GridLayout.spec(1,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);

      tv = new TextView(this);
      tv.setText("R10");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.WHITE);
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);

      row_spec = GridLayout.spec(7,1f);
      col_spec = GridLayout.spec(1,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);


      tv = new TextView(this);
      tv.setText("R20");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.WHITE);
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);

      row_spec = GridLayout.spec(8,1f);
      col_spec = GridLayout.spec(1,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);

      tv = new TextView(this);
      tv.setText("R30");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.WHITE);
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);

      row_spec = GridLayout.spec(9,1f);
      col_spec = GridLayout.spec(1,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);


      tv = new TextView(this);
      tv.setText("R40");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.WHITE);
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);

      row_spec = GridLayout.spec(10,1f);
      col_spec = GridLayout.spec(1,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);

      tv = new TextView(this);
      tv.setText("From");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.YELLOW);
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);

      row_spec = GridLayout.spec(6,1f);
      col_spec = GridLayout.spec(2,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);

      tv = new TextView(this);
      tv.setText("0");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.YELLOW);
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);

      row_spec = GridLayout.spec(7,1f);
      col_spec = GridLayout.spec(2,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);

      tv = new TextView(this);
      tv.setText("12");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.YELLOW);
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);

      row_spec = GridLayout.spec(8,1f);
      col_spec = GridLayout.spec(2,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);

      tv = new TextView(this);
      tv.setText("18");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.YELLOW);
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);

      row_spec = GridLayout.spec(9,1f);
      col_spec = GridLayout.spec(2,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);

      tv = new TextView(this);
      tv.setText("22");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.YELLOW);
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);

      row_spec = GridLayout.spec(10,1f);
      col_spec = GridLayout.spec(2,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);


      tv = new TextView(this);
      tv.setText("To");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.YELLOW);
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);

      row_spec = GridLayout.spec(6,1f);
      col_spec = GridLayout.spec(3,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);

      tv = new TextView(this);
      tv.setText("11");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.YELLOW);
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);

      row_spec = GridLayout.spec(7,1f);
      col_spec = GridLayout.spec(3,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);

      tv = new TextView(this);
      tv.setText("17");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.YELLOW);
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);

      row_spec = GridLayout.spec(8,1f);
      col_spec = GridLayout.spec(3,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);

      tv = new TextView(this);
      tv.setText("21");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.YELLOW);
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);

      row_spec = GridLayout.spec(9,1f);
      col_spec = GridLayout.spec(3,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);

      tv = new TextView(this);
      tv.setText("23");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.YELLOW);
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);

      row_spec = GridLayout.spec(10,1f);
      col_spec = GridLayout.spec(3,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);


      tv = new TextView(this);
      tv.setText("Greeting");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.rgb(255,204,153));
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);

      row_spec = GridLayout.spec(6,1f);
      col_spec = GridLayout.spec(4,2,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);

      tv = new TextView(this);
      tv.setText("Good Morning");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.rgb(255,204,153));
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);

      row_spec = GridLayout.spec(7,1f);
      col_spec = GridLayout.spec(4,2,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);

      tv = new TextView(this);
      tv.setText("Good Afternoon");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.rgb(255,204,153));
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);

      row_spec = GridLayout.spec(8,1f);
      col_spec = GridLayout.spec(4,2,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);

      tv = new TextView(this);
      tv.setText("Good Evening");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.rgb(255,204,153));
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);

      row_spec = GridLayout.spec(9,1f);
      col_spec = GridLayout.spec(4,2,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);

      tv = new TextView(this);
      tv.setText("Good Night");
      tv.setTextSize(16);
      tv.setBackgroundColor(Color.rgb(255,204,153));
      tv.setTextColor(Color.BLACK);
      tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);

      row_spec = GridLayout.spec(10,1f);
      col_spec = GridLayout.spec(4,2,1f);
      cParams = new GridLayout.LayoutParams(row_spec, col_spec);
      cParams.setMargins(10,10,10,10);
      tv.setLayoutParams(cParams);
      root.addView(tv);

      setContentView(root);
    }
}
