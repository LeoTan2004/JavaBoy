package org.javaboy.core.element;

/**
 * 文档中的元素
 * <p>能够设置参数</p>
 *
 * @author Leo,Log4JErr
 * @date 2023/10/11 14:17
 */
public interface Element {
    /**
     * 获取此元素标签的名称
     * <p>可参考DOM中的tagName</p>
     *
     * @return 标签名称
     */
    String getTagName();
}
