package com.pattern.mode.state.abs;

import android.util.Log;

import com.pattern.mode.state.stateimpl.Context;


/**
 * Description :
 * <p/>
 * Created : TIAN FENG
 * Date : 2018/5/10
 * Email : 27674569@qq.com
 * Version : 1.0
 */
public abstract class AbsState implements IState{

    protected Context context;

    public void setContext(Context context){
        this.context = context;
    }

    protected void println(String message){
        Log.e("State", message);
    }
}
