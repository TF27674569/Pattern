package com.pattern.mode.state.stateimpl;

import com.pattern.mode.state.abs.AbsState;

/**
 * Description : 电梯在关闭电梯门时的状态
 * <p/>          可以开门，可以run
 * Created : TIAN FENG
 * Date : 2018/5/10
 * Email : 27674569@qq.com
 * Version : 1.0
 */
public class CloseState extends AbsState {
    /**
     * 打开
     */
    @Override
    public void open() {
        context.setControl(Context.OPEN);
        context.getControl().open();
    }

    /**
     * 关闭
     */
    @Override
    public void close() {
        println("关闭电梯");
    }

    /**
     * 停止
     */
    @Override
    public void stop() {

    }

    /**
     * 执行
     */
    @Override
    public void run() {
        context.setControl(Context.RUN);
        context.getControl().run();
    }
}
