package com.pattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.pattern.mode.iterator.ArrayList;
import com.pattern.mode.iterator.Iterator;
import com.pattern.mode.iterator.List;


public class MainActivity extends AppCompatActivity {

    private List<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < 132; i++) {
            list.add("position:" + i);
        }


        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            Log.e("TAG", iterator.next());
        }


    }
}
