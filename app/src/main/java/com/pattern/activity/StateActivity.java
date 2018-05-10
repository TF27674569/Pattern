package com.pattern.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.TextView;
import android.widget.Toast;

import com.pattern.mode.state.StateControl;

/**
 * Description : 状态设计模式
 * <p/>
 * Created : TIAN FENG
 * Date : 2018/5/10
 * Email : 27674569@qq.com
 * Version : 1.0
 */
public class StateActivity extends BaseTextViewActivity{

    @Override
    protected void initData() {
        Toast.makeText(this, "看log", Toast.LENGTH_SHORT).show();
        textView.setGravity(Gravity.CENTER);
        textView.setText("看log");
        textView.setTextSize(30);
        StateControl.run();
    }
}
