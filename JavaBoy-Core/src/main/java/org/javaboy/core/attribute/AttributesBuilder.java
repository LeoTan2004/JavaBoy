package org.javaboy.core.attribute;

import org.javaboy.core.UndefinedOperation;

/**
 * Attributes 的工厂模式的抽象工厂
 *
 * @author Leo
 * @date 2023/10/17 18:46
 */
public abstract class AttributesBuilder {
    /**
     * 获取默认的属性工厂
     *
     * @return 默认的属性工厂
     */
    public static AttributesBuilder defaultAttributesBuilder() {
        //TODO (LeoTan,2023/10/17 18:49) 返回默认的属性工厂
        throw new UndefinedOperation();
    }

    /**
     * 构造一个Attributes对象
     *
     * @return Attributes
     */
    public abstract Attribute build();
}
