package org.javaboy.core.element;

/**
 * 样式类
 *
 * @author Leo
 * @date 2023/10/11 14:27
 */
public interface Style<T> {
    String getName();

    T getValue();

    void setValue(T value);
}
