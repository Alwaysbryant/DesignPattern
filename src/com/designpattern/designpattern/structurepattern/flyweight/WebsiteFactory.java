package com.designpattern.designpattern.structurepattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 网站工厂
 */
public class WebsiteFactory {
    private Map<String, ConcreteWebsite> pool = new HashMap<>();

    /**
     * 获取网站
     * @param way 根据不同的途径
     * @return 网站，如果存在即返回，不存在就创建
     */
    public Website getWebsiteCategory(String way) {
        if ( !pool.containsKey(way)) {
            pool.put(way, new ConcreteWebsite());
        }
        return (Website) pool.get(way);
    }

    public int getAllWays() {
        return pool.size();
    }
}
