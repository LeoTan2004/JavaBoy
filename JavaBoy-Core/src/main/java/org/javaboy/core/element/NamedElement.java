package org.javaboy.core.element;

/**
 * 可以命名的元素
 * 主要用在Form表单中的输入字段的命名
 *
 * @author Leo
 * @date 2023/10/11 15:24
 */
public interface NamedElement extends Element {
    /**
     * 查询元素命名，如果没有手动命名，有可能返回空
     * <p>注意这里是有可能，他的实现可以让他默认生成名称，简化前后端交互时的代码</p>
     *
     * @return 元素的名称
     */
    String getName();

    /**
     * 设置元素名称
     * 为空代表清除名称这一属性
     *
     * @param name 要这是的名称
     */
    void setName(String name);
}
