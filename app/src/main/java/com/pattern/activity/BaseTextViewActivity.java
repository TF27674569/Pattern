package com.pattern.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.pattern.R;

/**
 * Description :
 * <p/>
 * Created : TIAN FENG
 * Date : 2018/5/10
 * Email : 27674569@qq.com
 * Version : 1.0
 */
public abstract class BaseTextViewActivity extends AppCompatActivity{

    protected TextView textView;;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);
        textView = findViewById(R.id.text);
        initData();
    }

    protected abstract void initData();
}
