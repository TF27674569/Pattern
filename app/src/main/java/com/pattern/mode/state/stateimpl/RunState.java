package com.pattern.mode.state.stateimpl;

import com.pattern.mode.state.abs.AbsState;

/**
 * Description : 电梯运行过程
 * <p/>          只能停止电梯
 * Created : TIAN FENG
 * Date : 2018/5/10
 * Email : 27674569@qq.com
 * Version : 1.0
 */
public class RunState extends AbsState {
    /**
     * 打开
     */
    @Override
    public void open() {

    }

    /**
     * 关闭
     */
    @Override
    public void close() {

    }

    /**
     * 停止
     */
    @Override
    public void stop() {
        context.setControl(Context.STOP);
        context.getControl().stop();
    }

    /**
     * 执行
     */
    @Override
    public void run() {
        println("运行电梯");
    }
}
