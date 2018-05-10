package com.pattern.mode.state.stateimpl;

import com.pattern.mode.state.abs.AbsState;
import com.pattern.mode.state.abs.IState;

/**
 * Description : 控制类
 * <p/>
 * Created : TIAN FENG
 * Date : 2018/5/10
 * Email : 27674569@qq.com
 * Version : 1.0
 */
public class Context {
    public static final AbsState STOP = new StopState();
    public static final AbsState OPEN = new OpenState();
    public static final AbsState CLOSE = new CloseState();
    public static final AbsState RUN = new RunState();

    private AbsState controlState;

    public void setControl(AbsState absState) {
        controlState = absState;
        controlState.setContext(this);
    }

    public AbsState getControl() {
        return controlState;
    }

    public void run() {
        controlState.stop();
        controlState.open();
        controlState.close();
        controlState.run();
    }
}
