package com.genshin.reaction;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
@ToString
@NoArgsConstructor
public class Increase {
    // 增幅反应基础倍率,克制2.0,被克制1.5
    private Double restrain = 0.0;
    // 反应系数提高(如魔女套,默认0.0)
    private Double coefficient = 0.0;

    /**
     * 元素精通提升计算方法<br/>
     * 计算方式为:
     * 元素精通提升=(2.78*精通)/(精通+1400)
     *
     * @param elm 元素精通值
     * @return 小数形式的元素精通提升倍率
     */
    public static Double elmRate(Double elm) {
        return (2.78 * elm) / (1400 + elm);
    }
}
