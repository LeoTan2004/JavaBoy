package org.javaboy.core.element;

import java.util.Set;

/**
 * 能够被鉴别省份、的标签
 * <p>一个元素能够设置类别,Id</p>
 * <p>这种特性对应Html中的<b>class,id</b>属性，我们可以设置多个属性，但是类型不建议重复</p>
 *
 * @author Leo
 * @date 2023/10/11 14:20
 */
public interface IdentifyElement extends Element {
    Set<String> getClazz();

    void setClazz(Set<String> clazz);

    boolean isClazz(String clazz);

    void addClazz(String clazz);

    String getId();

    void setId(String id);
}
