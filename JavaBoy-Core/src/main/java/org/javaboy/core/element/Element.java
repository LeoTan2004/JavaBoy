package org.javaboy.core.element;

/**
 * 文档中的元素
 * <p>能够设置参数</p>
 *
 * @author Leo,Log4JErr
 * @date 2023/10/11 14:17
 */
public interface Element {
    //既然Style可以抽象，Property也行！

    /**
     * 获取元素的某个属性
     * @param propertyName 要获取的属性的名称
     * @return
     */
    ElementProperty getProperty(String propertyName);

    /**
     * 获取元素的某个属性，以原始的字符串为属性名和值
     * <p>只是个语法糖</p>
     * @param propertyName 要获取的属性的名称
     * @return
     */
    default String getRawPropertyValue(String propertyName){
        ElementProperty targetProperty= getProperty(propertyName);
        return targetProperty.getValue();
    }

    void setProperty(ElementProperty property);
    /**
     * 获取此元素标签的名称
     * <p>可参考DOM中的tagName</p>
     *
     * @return 标签名称
     */
    String getTagName();
}
