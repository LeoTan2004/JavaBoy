package org.javaboy.core.element;

import org.javaboy.core.properties.Style;

import java.util.Map;

/**
 * 能够设置样式的元素
 * <p>设置元素的样式，可以通过Style对象设置样式</p>
 * <p>我们需要注意的是，不能够使类的名称冲突，比如宽度的style只能在一个类型中包含一个</p>
 *
 * @author Leo
 * @date 2023/10/11 14:26
 */
public interface StyleElement extends PropertyElement {
    /**
     * 添加样式
     *
     * @param style 样式
     */
    void addStyle(Style style);

    /**
     * 获取样式
     *
     * @param name 样式名称
     * @return 样式对象
     */
    Style getStyle(String name);

    /**
     * 清除样式
     */
    void clearStyle();

    /**
     * 返回所有样式
     *
     * @return 样式的值
     */
    Map<String, Style> getStyles();

}
