package org.javaboy.core.element;

/**
 * 文档中的元素
 * <p>能够设置参数</p>
 *
 * @author Leo
 * @date 2023/10/11 14:17
 */
public interface AttributedElement extends Element {
    /**
     * 使用键值对的方式获取属性
     *
     * @param attribute 属性名称
     * @return 属性的内容
     */
    String getAttribute(String attribute);

    /**
     * 通过键值对的方式设置属性
     *
     * @param attribute 属性名称
     * @param value    属性值
     */
    void setAttribute(String attribute, String value);

}
