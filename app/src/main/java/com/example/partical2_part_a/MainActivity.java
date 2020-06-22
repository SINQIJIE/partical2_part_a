package com.example.partical2_part_a;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.number.IntegerWidth;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount=0;
    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount =(TextView) findViewById(R.id.shown_count);
    }

   public void shownToast(View view){
        Toast toast = Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT);

        toast.show();
   }

    public void countUp(View view){
        ++mCount;
        if(mShowCount !=null)
            mShowCount.setText(Integer.toString(mCount));
    }
}