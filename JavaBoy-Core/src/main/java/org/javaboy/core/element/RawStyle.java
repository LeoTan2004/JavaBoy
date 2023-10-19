package org.javaboy.core.element;

/**
 * 原始样式
 * <p>原始的，使用字符串直接描述名称Name和值Value的CSS样式</p>
 *
 * @author Log4JErr
 * @date 2023/10/19 20:35
 */
public final class RawStyle implements Style{
    private String styleName,styleValue;

    public RawStyle(String name,String value){
        styleName=name;
        styleValue=value;
    }

    /**
     * 将一个样式变为原始样式
     * @param metaStyle 待转换的样式
     */
    public RawStyle(RawStyle metaStyle){
        styleName=metaStyle.getName();
        styleValue=metaStyle.getValue();
    }

    @Override
    public String getName() {
        return styleName;
    }

    public void setName(String name) {
        styleName=name;
    }

    @Override
    public String getValue() {
        return styleValue;
    }

    public  void setValue(String value){
        styleValue=value;
    }
}