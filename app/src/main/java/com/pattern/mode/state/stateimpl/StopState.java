package com.pattern.mode.state.stateimpl;

import com.pattern.mode.state.abs.AbsState;

/**
 * Description : 电梯停止状态
 * <p/>         可以rnn  可以 开门  可以关门
 * Created : TIAN FENG
 * Date : 2018/5/10
 * Email : 27674569@qq.com
 * Version : 1.0
 */
public class StopState extends AbsState {
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
        context.setControl(Context.CLOSE);
        context.getControl().close();
    }

    /**
     * 停止
     */
    @Override
    public void stop() {
        println("停止电梯");
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
