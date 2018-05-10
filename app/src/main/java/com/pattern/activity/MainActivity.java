package com.pattern.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.pattern.R;


public class MainActivity extends AppCompatActivity {

    private ListView listView;

    private static ActivityModle[] mItemName = {
            new ActivityModle("迭代器", IteratorActivity.class),
            new ActivityModle("状态", StateActivity.class)};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        setAdapter();

    }

    private void setAdapter() {
        listView.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return mItemName.length;
            }

            @Override
            public Object getItem(int position) {
                return mItemName[position];
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                if (convertView == null) {
                    convertView = new Button(MainActivity.this);
                }
                Button button = (Button) convertView;
                button.setText(mItemName[position].name);
                button.setOnClickListener(new Listener(position));
                return button;
            }
        });
    }

    class Listener implements View.OnClickListener {

        int position;

        Listener(int position) {
            this.position = position;
        }

        @Override
        public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, mItemName[position].clazz));
        }
    }


}
