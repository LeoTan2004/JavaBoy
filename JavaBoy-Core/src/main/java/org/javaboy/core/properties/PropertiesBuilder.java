package org.javaboy.core.properties;

import org.javaboy.core.UndefinedOperation;

/**
 * Properties 的工厂模式的抽象工厂
 *
 * @author Leo
 * @date 2023/10/17 18:46
 */
public abstract class PropertiesBuilder {
    /**
     * 构造一个Properties对象
     *
     * @return Properties对象
     */
    public abstract Properties build();


    /**
     * 获取默认的属性工厂
     *
     * @return 默认的属性工厂
     */
    public static PropertiesBuilder defaultPropertiesBuilder() {
        //TODO (LeoTan,2023/10/17 18:49) 返回默认的属性工厂
        throw new UndefinedOperation();
    }
}
