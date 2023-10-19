package org.javaboy.core.element;

/**
 * 原始属性
 * <p>原始的，直接使用字符串表示名称和值的html元素属性</p>
 *
 * @author Log4JErr
 * @date 2023/10/19 21:44
 */
public class RawElementProperty implements ElementProperty{
    private String propertyName,propertyValue;

    public RawElementProperty(String name,String value){
        propertyValue=value;
        propertyName=name;
    }
    /**
     * 将一个属性变为原始属性
     * @param metaProperty 待转换的属性
     */
    public RawElementProperty(ElementProperty metaProperty){
        propertyName=metaProperty.getName();
        propertyValue=metaProperty.getValue();
    }

    @Override
    public String getName() {
        return propertyName;
    }

    @Override
    public void setName(String name) {
        propertyName=name;
    }

    @Override
    public String getValue() {
        return propertyValue;
    }

    @Override
    public void setValue(String value) {
        propertyValue=value;
    }
}
