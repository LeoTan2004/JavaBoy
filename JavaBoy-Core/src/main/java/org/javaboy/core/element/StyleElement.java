package org.javaboy.core.element;

import java.util.List;

/**
 * 能够设置样式的元素
 * <p>设置元素的样式，可以通过Style对象设置样式</p>
 * <p>我们需要注意的是，不能够使类的名称冲突，比如宽度的style只能在一个类型中包含一个</p>
 *
 * @author Leo,Log4JErr
 * @date 2023/10/19 21:10
 */
public interface StyleElement extends Element {
    /**
     * 设置此元素的样式
     * @param style
     */
    void addStyle(Style style);

    /**
     * 根据样式名称获取此元素的特定样式
     * @param name
     */
    Style getStyle(String name);

    /**
     * 删除此元素所有样式
     */
    void clearStyle();

    /**
     * 获取此元素当前所有样式，只读
     * <p><2023/10/19 Log4JErr>:允许用户直接修改List太危险了，所以最好返回的是一个clone</p>
     * @return
     */
    Style[] listStyle();
}
