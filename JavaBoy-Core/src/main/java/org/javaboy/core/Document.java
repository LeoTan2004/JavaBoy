package org.javaboy.core;

/**
 * HTML文档的结构
 * <p>
 *      生成器可以通过 {@link Document#root()}获取到文档的根元素
 * </p>
 * <p>
 *
 * </p>
 *
 * @author Leo
 * @date 2023/9/27 14:49
 */
public interface Document {
    /**
     * 获取Html文档的根元素
     *
     * @return 根元素
     */
    Component root();
}
