package org.javaboy.core.element;

public interface AttributedElement {
    /**
     * 获取元素的某个属性
     * @param attributeName 要获取的属性的名称
     */
    ElementAttribute<?> getAttribute(String attributeName);

    void setAttribute(ElementAttribute<?> Attribute);
}
