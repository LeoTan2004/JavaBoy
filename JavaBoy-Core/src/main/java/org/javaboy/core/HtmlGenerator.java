package org.javaboy.core;

/**
 * Html生成器
 * <p>
 *     可以调用{@link HtmlGenerator#handle(Document)}生成相应的Html文档
 * </p>
 * @author Leo
 * @date 2023/9/27 15:04
 */
public class HtmlGenerator implements DocumentHandle{
    /**
     * 根据Document对象生成
     * @param document 待处理的文档
     * @return 原样返回，不进行处理
     */
    @Override
    public Document handle(Document document) {
        return document;
    }
}
