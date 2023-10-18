package org.javaboy.core.properties;

import java.util.Map;

/**
 * 属性类
 * <p>可以参考HashMap，但是需要正对自己的功能进行改良，提升性能的同时降低可用性，同时最好开发出一些行的功能</p>
 *
 * @author Leo
 * @date 2023/10/17 18:44
 */
public abstract class Properties implements Map<String, String> {
    //TODO (LeoTan,2023/10/18 20:50) 构建一个键值对形式的接口，需要更高的性能（针对性优化）
}
