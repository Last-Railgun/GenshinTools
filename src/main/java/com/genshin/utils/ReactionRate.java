package com.genshin.utils;

import lombok.Getter;

/**
 * ReactionRate
 * 用于存放反应的反应基础倍率<br/>
 * 增幅反应仅存在克制和被克制,如水触发火蒸发2.0, 冰触发火融化1.5
 * 超导 0.5：扩散0.6：碎冰1.5：超载2：感电1.2：绽放2：烈绽放3：超绽放3：燃烧0.25<br/>
 * 数据来源: https://bbs.nga.cn/read.php?tid=25564438
 *
 * @author LastRailgun
 * @version 1.0
 * @date 2023-05-08 08:26
 */
@Getter
public enum ReactionRate {
    RES("克制", 2.0),             // 克制倍率,水->火,火->冰
    UNRES("被克制", 1.5),          // 被克制倍率,火->水,冰->火
    BLOOM("绽放", 2.0),           // 绽放基础倍率
    BURGEON("烈绽放", 3.0),        // 烈绽放基础倍率
    BURNING("燃烧", 0.25),        // 燃烧基础倍率
    ELECTRO_CHARGED("感电", 1.2), // 感电基础倍率
    HYPER_BLOOM("超绽放", 3.0),    // 超绽放基础倍率
    OVERLOADED("超载", 2.0),      // 超载基础倍率
    SHATTERED("碎冰", 1.5),       // 碎冰基础倍率
    SUPERCONDUCT("超导", 0.5),    // 超导基础倍率
    SWIRL("扩散", 0.6);           // 扩散基础倍率

    // 反应名称
    private String name;
    // 反应基础倍率
    private Double rate;

    ReactionRate(String name, Double rate) {
        this.name = name;
        this.rate = rate;
    }
}
