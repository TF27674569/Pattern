package com.pattern.mode.iterator;

import java.util.Arrays;

/**
 * Description :
 * <p/>
 * Created : TIAN FENG
 * Date : 2018/5/4
 * Email : 27674569@qq.com
 * Version : 1.0
 */
public class ArrayList<T> implements List<T> {

    private int length;
    private Object[] array;
    private int size = 0;

    public ArrayList() {
        this(10);
    }

    public ArrayList(int length) {
        this.length = length;
        array = new Object[length];
    }


    /**
     * 添加
     *
     * @param obj
     */
    @Override
    public synchronized void add(T obj) {
        ensureCapacityInternal(length + 1);
        array[size] = obj;
        size++;
    }

    private void ensureCapacityInternal(int length) {
        if (length >= this.length) {
            array = Arrays.copyOf(array, this.length + length);
            this.length = array.length;
        }
    }

    /**
     * 获取
     *
     * @param index
     */
    @Override
    public T get(int index) {
        // 判断位置是否合法
        if (index >= this.size || index < 0) {
            return null;
        }
        return (T) array[index];
    }

    /**
     * 迭代器
     */
    @Override
    public Iterator iterator() {
        return new ArrayListIterator<>(this);
    }

    /**
     * 大小
     */
    @Override
    public int size() {
        return size;
    }
}
