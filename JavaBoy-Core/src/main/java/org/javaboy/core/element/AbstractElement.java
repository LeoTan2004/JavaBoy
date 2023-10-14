package org.javaboy.core.element;

import java.util.List;
import java.util.Set;

/**
 * 常见的元素的抽象
 * <p>将常见的功能实现</p>
 *
 * @author Leo
 * @date 2023/10/14 8:34
 */
public abstract class AbstractElement implements IdentifyElement, StyleElement {
    //TODO (LeoTan,2023/10/14 8:38) 这里需要将这些接口实现，这样大部分的子类就可以忽略这些接口的实现，简化开发

    @Override
    public String getProperty(String property) {
        return null;
    }

    @Override
    public void setProperty(String property, String value) {

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
    public void addStyle(String name, String value) {

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
