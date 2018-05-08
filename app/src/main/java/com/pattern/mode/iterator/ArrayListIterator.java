package com.pattern.mode.iterator;

/**
 * Description : 迭代器
 * <p/>
 * Created : TIAN FENG
 * Date : 2018/5/4
 * Email : 27674569@qq.com
 * Version : 1.0
 */
public class ArrayListIterator<T> implements Iterator<T> {

    private List<T> list;
    private int index;

    ArrayListIterator(List<T> list) {
        this.list = list;
    }

    /**
     * 是否存在下一个元素
     */
    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    /**
     * 获取下一个元素
     */
    @Override
    public T next() {
        T result = list.get(index);
        index++;
        return result;
    }
}
