package org.javaboy.core.element;

public interface ElementAttribute<T> {
    String getName();
    void setName(String name);
    T getValue();
    void setValue(T value);
}