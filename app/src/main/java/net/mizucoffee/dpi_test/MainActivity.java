package net.mizucoffee.dpi_test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Display disp;
        disp = getWindowManager().getDefaultDisplay();
        DisplayMetrics dm = new DisplayMetrics();
        disp.getMetrics(dm);
        double inchX = dm.widthPixels / dm.xdpi;
        double inchY = dm.heightPixels / dm.ydpi;
        double inch = Math.sqrt((inchX * inchX) + (inchY * inchY));

        System.out.println(inch);

        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,(int)dm.ydpi * 3));

    }
}
