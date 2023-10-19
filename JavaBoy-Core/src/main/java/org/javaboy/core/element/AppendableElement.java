package org.javaboy.core.element;

import java.util.List;

/**
 * 可添加子元素的元素类型
 *
 * @author Leo,Log4JErr
 * @date 2023/10/11 14:36
 */
public interface AppendableElement extends Element {
    /**
     * 通过下标获取指定子元素
     *
     * @param index 下标
     * @return 处于此下标的子元素
     */
    Element getChild(int index);

    /**
     * 获取当前对象的子对象的个数
     *
     * @return 子对象的个数
     */
    int getChildrenCount();

    /**
     * 设置多个子元素
     * <p>一次性设置所有子元素，元素顺序按照参数顺序排序。之前的子元素会被清除。若要使用追加的方式添加元素，可使用{@link #appendChild(Element)}</p>
     * <p><Log4JErr 2023/10/19>children参数改成可迭代对象了，我可不想被List限制</></p>
     * @param children 要添加的子元素集合
     */
    void setChildren(Iterable<Element> children);

    /**
     * 一次性添加多个子元素
     * <p><Log4JErr 2023/10/19>一粒糖而已...</></p>
     * @param children 要添加的子元素集合
     */
    default void appendChildren(Element... children){
        for (Element child:children) {
            appendChild(child);
        }
    }

    /**
     * 添加子元素
     *
     * @param child 子元素
     */
    void appendChild(Element child);

    /**
     * 将元素插入到指定位置
     *
     * @param child 子元素
     * @param index 下标
     */
    void insertChild(Element child, int index);

    /**
     * 删除指定下标的子元素
     *
     * @param index 要删除的子元素的下标
     */
    void removeChild(int index);

    /**
     * 删除全部子元素
     */
    void clearChildren();
}
