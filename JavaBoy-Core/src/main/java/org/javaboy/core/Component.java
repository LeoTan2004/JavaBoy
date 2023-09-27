package org.javaboy.core;

/**
 * 组件接口
 * 包含组件名称
 *
 * @author Leo
 * @date 2023/9/27 14:43
 */
public interface Component {
    /**
     * 获取组件的名称
     * 缺省是直接返回类名
     *
     * @return 组件的名称
     */
    default String getName() {
        return getClass().getName();
    }
}
