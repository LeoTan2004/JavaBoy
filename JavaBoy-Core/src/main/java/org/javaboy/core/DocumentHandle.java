package org.javaboy.core;

/**
 * 文档处理器
 * <p>
 * {@link Document}的处理器
 * </p>
 *
 * @author Leo
 * @date 2023/9/27 14:56
 */
public interface DocumentHandle {
    /**
     * 文档处理
     * @param document 待处理的文档
     * @return 处理后的文档
     */
    Document handle(Document document) throws FailToHandle;
}
