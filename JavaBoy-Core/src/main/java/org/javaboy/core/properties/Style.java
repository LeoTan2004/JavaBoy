package org.javaboy.core.properties;

/**
 * 样式接口
 *
 * @author Leo
 * @date 2023/10/11 14:27
 */
public interface Style<T> {
    /**
     * 获取样式名称
     * 常见的比如
     * <ol>
     *     <li>color</li>
     *     <li>background</li>
     *     <li>border</li>
     *     ...
     * </ol>
     *
     * @return 返回样式的名称
     */
    String getName();

    /**
     * 获取样式的值
     *
     * @return 样式的值
     */
    T getValue();

    /**
     * 设置样式的值
     *
     * @param value 样式的值
     */
    void setValue(T value);
}
