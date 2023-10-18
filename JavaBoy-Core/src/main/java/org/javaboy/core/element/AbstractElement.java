package org.javaboy.core.element;

import org.javaboy.core.properties.Properties;
import org.javaboy.core.properties.PropertiesBuilder;
import org.javaboy.core.properties.Style;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/**
 * 常见的元素的抽象
 * <p>将常见的功能实现</p>
 *
 * @author Leo
 * @date 2023/10/14 8:34
 */
//TODO (LeoTan,2023/10/14 8:38) 这里需要将这些接口实现，这样大部分的子类就可以忽略这些接口的实现，简化开发
public abstract class AbstractElement implements IdentifyElement, StyleElement {
    // 默认属性构造工厂
    private static final PropertiesBuilder defaultPropertiesBuilder = PropertiesBuilder.defaultPropertiesBuilder();
    // 属性对象工厂
    private final PropertiesBuilder builder;

    // K-V的形式存储属性
    private final AtomicReference<Properties> properties = new AtomicReference<>();

    protected boolean initProperties() {
        return properties.compareAndSet(null, builder.build());
    }

    public AbstractElement() {
        this(defaultPropertiesBuilder);
    }

    public AbstractElement(PropertiesBuilder builder) {
        this.builder = builder;
    }

    @Override
    public String getProperty(String property) {
        if (properties.get() == null || property.isEmpty()) {// 可能被动抛出空指针
            return null;
        }
        return properties.get().get(property);
    }

    @Override
    public void setProperty(String property, String value) {
        if (property == null || value == null)
            throw new NullPointerException("property or value cannot be null");
        if (properties.get() == null && initProperties()) {
            if (properties.get() == null)// recheck properties
                throw new NullPointerException("properties initialize failed");
        }
        properties.get().put(property, value);
    }

    @Override
    public String getTagName() {
        return null;
    }

    @Override
    public Set<String> getClazz() {
        return null;
    }

    @Override
    public void setClazz(Set<String> clazz) {

    }

    @Override
    public boolean isClazz(String clazz) {
        return false;
    }

    @Override
    public void addClazz(String clazz) {

    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public void setId(String id) {

    }

    @Override
    public void addStyle(Style style) {

    }


    @Override
    public Style getStyle(String name) {
        return null;
    }

    @Override
    public void clearStyle() {

    }

    @Override
    public List<Style> listStyle() {
        return null;
    }
}
