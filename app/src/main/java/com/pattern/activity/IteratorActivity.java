package com.pattern.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.pattern.R;
import com.pattern.mode.iterator.ArrayList;
import com.pattern.mode.iterator.Iterator;
import com.pattern.mode.iterator.List;

/**
 * Description :  ArrayList 迭代器
 * <p/>
 * Created : TIAN FENG
 * Date : 2018/5/10
 * Email : 27674569@qq.com
 * Version : 1.0
 */
public class IteratorActivity extends BaseTextViewActivity{

    List<Integer> list = new ArrayList<>();

    @Override
    protected void initData() {
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        StringBuilder builder = new StringBuilder();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            Log.e("IteratorActivity", "iterator: "+ next);
            builder.append("iterator: ").append(next).append("\n");
        }

        textView.setText(builder.toString());
    }
}
