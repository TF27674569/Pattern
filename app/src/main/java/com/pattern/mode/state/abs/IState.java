package com.pattern.mode.state.abs;

/**
 * Description : 电梯状态接口
 * <p/>
 * Created : TIAN FENG
 * Date : 2018/5/10
 * Email : 27674569@qq.com
 * Version : 1.0
 */
public interface IState {

    /**
     * 打开
     */
    void open();

    /**
     * 关闭
     */
    void close();

    /**
     * 停止
     */
    void stop();

    /**
     * 执行
     */
    void run();
}
