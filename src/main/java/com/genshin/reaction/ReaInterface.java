package com.genshin.reaction;

import com.genshin.utils.ReactionRate;

/**
 * ReaInterface
 *
 * @author LastRailgun
 * @version 1.0
 * @date 2023-05-09 09:24
 */
public interface ReaInterface {
    /**
     * 用于计算每种类型反应的精通提升比例
     *
     * @param elm 精通值
     * @return 小数形式的精通提升
     */
    Double elmRate(Double elm);

    /**
     * 用于获取反应提升系数
     *
     * @return 小数形式的反应提升系数
     */
    Double getCoefficient();

    /**
     * 用于获取反应倍率
     *
     * @return 反应倍率枚举
     */
    ReactionRate getReaRate();
}
