package com.pattern.mode.state;

import com.pattern.mode.state.stateimpl.Context;

/**
 * Description : 控制类
 * <p/>
 * Created : TIAN FENG
 * Date : 2018/5/10
 * Email : 27674569@qq.com
 * Version : 1.0
 */
public class StateControl {


    public static void run(){
        Context context = new Context();
        context.setControl(Context.RUN);
        context.run();
    }

}
