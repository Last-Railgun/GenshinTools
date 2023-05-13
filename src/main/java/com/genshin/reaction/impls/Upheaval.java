package com.genshin.reaction.impls;

import com.genshin.attr.Panel;
import com.genshin.reaction.ReaInterface;
import com.genshin.utils.ReactionRate;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Upheaval
 * 剧变反应(包括绽放)
 *
 * @author LastRailgun
 * @version 1.0
 * @date 2023-05-09 09:25
 */
@Data
@AllArgsConstructor
public class Upheaval implements ReaInterface {
    // 剧变反应基础倍率
    private ReactionRate reaRate;
    // 反应伤害提高(如妮露天赋)
    private Double coefficient = 0.0;

    /**
     * 元素精通提升计算方法<br/>
     * 计算方式为:
     * 元素精通提升=(16*精通)/(精通+2000)
     *
     * @param panel 角色面板对象
     * @return 小数形式的元素精通提升倍率
     */
    @Override
    public Double elmRate(Panel panel) {
        return (16 * panel.getElm()) / (2000 + panel.getElm());
    }
}
