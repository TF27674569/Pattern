package com.pattern.mode.iterator;

/**
 * Description : 容器角色
 * <p/>
 * Created : TIAN FENG
 * Date : 2018/5/4
 * Email : 27674569@qq.com
 * Version : 1.0
 */
public interface List<T> {

    /**
     * 添加
     */
    public void add(T obj);

    /**
     * 获取
     */
    public T get(int index);

    /**
     * 迭代器
     */
    public Iterator<T> iterator();

    /**
     * 大小
     */
    public int size();
}
