package com.genshin.reaction.impls;

import com.genshin.attr.Panel;
import com.genshin.reaction.ReaInterface;
import com.genshin.utils.ReactionRate;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Increase
 * 增幅反应
 *
 * @author LastRailgun
 * @version 1.0
 * @date 2023-05-09 09:25
 */
@Data
@AllArgsConstructor
public class Increase implements ReaInterface {
    // 增幅反应基础倍率,克制2.0,被克制1.5
    private ReactionRate reaRate;
    // 反应系数提高(如魔女套,默认0.0)
    private Double coefficient = 0.0;

    /**
     * 元素精通提升计算方法<br/>
     * 计算方式为:
     * 元素精通提升=(2.78*精通)/(精通+1400)
     *
     * @param panel 角色面板对象
     * @return 小数形式的元素精通提升倍率
     */
    @Override
    public Double elmRate(Panel panel) {
        return (2.78 * panel.getElm()) / (1400 + panel.getElm());
    }
}
