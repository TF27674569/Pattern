package com.pattern.mode.state.stateimpl;

import com.pattern.mode.state.abs.AbsState;
import com.pattern.mode.state.abs.IState;

/**
 * Description : 电梯门打开状态
 * <p/>          只能进行关闭电梯门的操作
 * Created : TIAN FENG
 * Date : 2018/5/10
 * Email : 27674569@qq.com
 * Version : 1.0
 */
public class OpenState extends AbsState {
    /**
     * 打开
     */
    @Override
    public void open() {
        println("打开电梯");
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

    }

    /**
     * 执行
     */
    @Override
    public void run() {

    }
}
