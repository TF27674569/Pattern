package com.pattern.activity;

import android.app.Activity;

/**
 * Description :
 * <p/>
 * Created : TIAN FENG
 * Date : 2018/5/10
 * Email : 27674569@qq.com
 * Version : 1.0
 */
public class ActivityModle {

    public String name;
    public Class<? extends Activity> clazz;

    public ActivityModle(String name, Class<? extends Activity> clazz) {
        this.name = name;
        this.clazz = clazz;
    }
}
