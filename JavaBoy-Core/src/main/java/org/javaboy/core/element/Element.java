package org.javaboy.core.element;

/**
 * 文档中的元素
 * <p>能够设置参数</p>
 *
 * @author Leo,Log4JErr
 * @date 2023/10/11 14:17
 */
public interface Element {
    /**
     * 使用键值对的方式获取属性
     * (2023/10/19 Log4JErr) 砍了，qwq
     * @param property 属性名称
     * @return 属性的内容
     */
    @Deprecated
    String getProperty(String property);

    /**
     * 通过键值对的方式设置属性
     * (2023/10/19 Log4JErr) 也砍了，omo
     * @param property 属性名称
     * @param value    属性值
     */
    @Deprecated
    void setProperty(String property, String value);

    /**
     * 获取此元素标签的名称
     * <p>可参考DOM中的tagName</p>
     *
     * @return 标签名称
     */
    String getTagName();
}
