package org.javaboy.core.element;

import java.util.List;

/**
 * 可添加子元素的元素类型
 *
 * @author Leo
 * @date 2023/10/11 14:36
 */
public interface AppendableElement extends Element {
    /**
     * 通过下标获取指定子元素
     *
     * @param index 小标
     * @return 子元素
     */
    Element getChild(int index);

    /**
     * 获取当前对象的子对象的个数
     *
     * @return 子对象的个数
     */
    int getChildrenCount();

    /**
     * 添加子元素集合
     * <p>一次性设置多个子元素，元素顺序按照List顺序排序，如果设置之前存在子元素，会自动清空之前的元素。如果一追加的方式添加元素，可使用{@link #appendChild(Element)}</p>
     *
     * @param children 要添加的子元素集合
     */
    void setChildren(List<Element> children);

    /**
     * 末尾添加子元素
     *
     * @param child 子元素
     */
    void appendChild(Element child);

    /**
     * 将元素添加到指定位置
     *
     * @param child 子元素
     * @param index 下标
     */
    void addChild(Element child, int index);

    /**
     * 删除指定下标的元素
     *
     * @param index 要删除的子元素的下标
     */
    void removeChild(int index);

    /**
     * 删除全部子元素
     */
    void clearChildren();

}
