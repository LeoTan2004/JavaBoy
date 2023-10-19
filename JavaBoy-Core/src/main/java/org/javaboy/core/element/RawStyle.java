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