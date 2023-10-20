package org.javaboy.core.element;

public interface AttributedElement {
    /**
     * 获取元素的某个属性
     * @param propertyName 要获取的属性的名称
     */
    ElementAttribute<?> getProperty(String propertyName);

    void setProperty(ElementAttribute<?> property);
}
