package com.genshin.test;

import com.genshin.attr.Panel;
import com.genshin.attr.Rate;
import com.genshin.reaction.impls.Increase;
import com.genshin.utils.CalUtils;
import com.genshin.utils.ReactionRate;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * TestA
 *
 * @author LastRailgun
 * @version 1.0
 * @date 2023-05-07 07:38
 */

public class TestA {
    @Test
    public void test1() {
        // 建立角色面板
        Panel panel = new Panel(17625.0, 2478.3, 716.0, 96.3, 70.1, 225.9);
        Map<String, Double> atts = new HashMap<>();
        // 增伤计算还没写,这里直接加上
        atts.put("冰", 46.6);
        panel.setAtts(atts);
        System.out.println("角色基础面板:");
        System.out.println(panel);
        // 甘雨的10级重击总倍率
        Rate rate = new Rate();
        rate.setMode("atk");
        rate.setRate(230.0 + 392.0);
        // 计算基础伤害
        Double basicDmg = CalUtils.calBasicDmg(panel, rate);
        System.out.println("基础伤害为:" + basicDmg);
        // 根据基础伤害计算期望伤害
        Double desireDmg = CalUtils.calDesire(panel) * basicDmg;
        // 代入增伤
        desireDmg = desireDmg * (1 + 0.466 + 0.6 + 0.18 + 0.35) * 0.5 * 1.025;
        System.out.println("期望伤害为:" + desireDmg);
        // 计算增幅反应,融化1.5倍率,无系数提升
        Double finalDmg = desireDmg * CalUtils.calElm(panel, new Increase(ReactionRate.UNRES, 0.0));
        // 最终伤害
        System.out.println("最终伤害为:" + finalDmg);
    }

    @Test
    public void test2() {
        System.out.println(ReactionRate.BLOOM.getRate());
    }
}
