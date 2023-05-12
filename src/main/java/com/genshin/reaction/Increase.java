package com.genshin.reaction;

import lombok.Getter;
import lombok.Setter;

/**
 * Increase
 * 增幅反应
 *
 * @author LastRailgun
 * @version 1.0
 * @date 2023-05-09 09:25
 */
@Getter
@Setter
public class Increase {
    // 增幅反应基础倍率
    public static final Double restrain = 2.0;  // 克制
    public static final Double unRestrain = 1.5;// 被克制
    // 反应系数提高(如魔女套,默认0.0)
    private Double coefficient = 0.0;
}
