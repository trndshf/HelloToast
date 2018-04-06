package com.example.androidstudio.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }


    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_massage, Toast.LENGTH_LONG);
        toast.show();
    }

    public void CountUp(View view) {
        mCount++;
        if(mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void showPoke(View view) {
        Toast poke = Toast.makeText(this, R.string.show_poke, Toast.LENGTH_LONG);
        poke.show();
    }
}
