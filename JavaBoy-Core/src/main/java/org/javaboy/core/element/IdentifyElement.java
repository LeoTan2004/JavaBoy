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
public interface IdentifyElement extends AttributedElement {
    /**
     * 获取该元素的所有类名
     *
     * @return 该元素的所有类名
     */
    Set<String> getClazz();

    /**
     * 设置该元素的类名
     * <p><b>需要注意的是，这会将之前的类清空</b></p>
     *
     * @param clazz 需要设置的类名
     */
    void setClazz(Set<String> clazz);

    /**
     * 判断是够属于该类型
     *
     * @param clazz 类型名称
     * @return 是否属于该类型
     */
    boolean isClazz(String clazz);

    /**
     * 添加新的类型
     * <p>只要正确执行，就保证该类被参数类名锁修饰</p>
     *
     * @param clazz 新的类型名称
     */
    void addClazz(String clazz);

    /**
     * 获取Id
     * <p>如果没有专门设置Id的话，Id会自动生成</p>
     *
     * @return 获取到的ID
     */
    String getId();

    /**
     * 设置Id
     * <p>Id不能为<b>null</b>，也不能为空字符串，否则抛异常</p>
     *
     * @param id 要设置的Id
     */
    void setId(String id);
}
