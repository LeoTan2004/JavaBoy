package org.javaboy.core.element;

import java.util.Set;

/**
 * 能够被鉴别身份的html标签
 * <p>一个元素能够设置类别,Id</p>
 * <p>(为了将元素的类别(html标签中的class)与Java中的class区分，命名为clazz)</p>
 * <p>这种特性对应html中的<b>class,id</b>属性，我们可以设置多个属性，但是类型不建议重复</p>
 *
 * @author Leo,Log4JErr
 * @date 2023/10/11 14:20
 */
public interface IdentifyElement extends Element {
    /**
     * 获取元素的所有类别
     * @return 类别集合
     */
    Set<String> getClazz();

    /**
     * 覆盖设置元素的所有类别
     * <p>这会先删除原有的类别设置！</p>
     * @param clazz 用于覆盖的新类别集合
     */
    void setClazz(Set<String> clazz);

    /**
     * 获取元素是否是某个类别
     * @param clazz 要判断的类别
     * @return 是否是此类别
     */
    boolean isClazz(String clazz);

    /**
     * 为元素添加单个类别
     * @param clazz 要添加的类别
     */
    void addClazz(String clazz);

    /**
     * 获取元素的Id
     * @return 元素Id
     */
    String getId();

    /**
     * 设置元素的Id
     * @param 元素Id
     */
    void setId(String id);
}
