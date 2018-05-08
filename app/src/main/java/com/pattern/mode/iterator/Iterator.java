package com.pattern.mode.iterator;

/**
 * Description : 迭代器接口
 * <p/>
 * Created : TIAN FENG
 * Date : 2018/5/4
 * Email : 27674569@qq.com
 * Version : 1.0
 */
public interface Iterator<T> {
    /**
     * 是否存在下一个元素
     */
    public boolean hasNext();

    /**
     * 获取下一个元素
     */
    public T next();
}
