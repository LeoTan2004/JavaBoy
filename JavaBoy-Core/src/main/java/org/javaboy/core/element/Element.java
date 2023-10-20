package org.javaboy.core.element;

/**
 * @author Leo
 * @date 2023/10/20 15:38
 */
public interface Element {
    /**
     * 获取标签的名称
     * <p>可参考DOM中的tagName</p>
     *
     * @return 标签名称
     */
    String getTagName();
}
