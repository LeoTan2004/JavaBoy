package org.javaboy.core.element;

import java.util.List;
import java.util.Map;

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
     */
    void addStyle(Style<?> style);

    /**
     * 根据样式名称获取此元素的特定样式
     */
    Style<?> getStyle(String name);

    /**
     * 删除此元素所有样式
     */
    void clearStyle();

    /**
     * 获取此元素当前所有样式，只读
     */
    Map<String,Style<?>> getStyles();
}
