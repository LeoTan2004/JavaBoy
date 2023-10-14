package org.javaboy.core.element;

import java.util.List;

/**
 * 能够设置样式的元素
 * <p>设置元素的样式，可以通过Style对象设置样式</p>
 * <p>我们需要注意的是，不能够使类的名称冲突，比如宽度的style只能在一个类型中包含一个</p>
 *
 * @author Leo
 * @date 2023/10/11 14:26
 */
public interface StyleElement extends Element {

    void addStyle(Style style);

    void addStyle(String name, String value);

    Style getStyle(String name);

    void clearStyle();

    List<Style> listStyle();

}
