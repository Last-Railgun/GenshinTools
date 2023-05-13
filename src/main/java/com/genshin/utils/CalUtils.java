package com.genshin.utils;

import com.genshin.attr.Panel;
import com.genshin.attr.Rate;
import com.genshin.reaction.ReaInterface;
import com.genshin.reaction.impls.Sharpen;

/**
 * CalUtils
 * 计算工具类
 *
 * @author LastRailgun
 * @version 1.0
 * @date 2023-05-08 08:48
 */
public class CalUtils {
    /**
     * 计算基础伤害<br/>
     * 计算方式: 角色属性 * 面板倍率
     *
     * @param panel 角色面板对象
     * @param rate  角色倍率对象
     * @param mode  选择倍率 atk:攻击 hea:生命 def:防御 elm:元素精通
     * @return 基础伤害
     */
    public static Double calBasic(Panel panel, Rate rate, String mode) {
        return panel.getAtk() * rate.getRate() / 100.0;
    }

    /**
     * 计算基础伤害,多重倍率计算,如草神灭净三业<br/>
     * 计算方式: 角色属性1 * 面板倍率1 + 角色属性2 * 面板倍率2 + ...
     *
     * @param panel 角色面板对象
     * @param rates 角色倍率数组
     * @return 基础伤害
     */
    public static Double calBasic(Panel panel, Rate... rates) {
        double result = 0.0;
        for (Rate rate : rates) {
            switch (rate.getMode()) {
                case "hea":
                    result += rate.getRate() * panel.getHea() / 100.0;
                    continue;
                case "atk":
                    result += rate.getRate() * panel.getAtk() / 100.0;
                    continue;
                case "def":
                    result += rate.getRate() * panel.getDef() / 100.0;
                    continue;
                case "elm":
                    result += rate.getRate() * panel.getElm() / 100.0;
                    continue;
                default:
                    throw new RuntimeException("超出角色倍率对应的面板属性范围");
            }
        }
        return result;
    }

    /**
     * 计算角色的激化伤害<br/>
     * 计算方式: 基础伤害 + 角色等级系数 * 激化类型系数 * 精通倍率
     *
     * @param panel   角色面板对象
     * @param sharpen 激化反应对象
     * @param rates   角色倍率数组
     * @return 激化伤害
     */
    public static Double calSharpen(Panel panel, Sharpen sharpen, Rate... rates) {
        Double basicDmg = CalUtils.calBasic(panel, rates);
        Double levelRate = UpheavalRateLevel.rateLevelMap.get(panel.getLevel());
        return basicDmg + levelRate * sharpen.getReaRate().getRate() * calElm(panel, sharpen);
    }

    /**
     * 计算角色的暴击期望倍率<br/>
     * 计算方式: 1 + 暴击 * 暴击伤害
     *
     * @param panel 角色面板对象
     * @return 小数形式的角色暴击期望倍率
     */
    public static Double calDesire(Panel panel) {
        return 1.0 + (panel.getChr() * panel.getCd()) / 10000.0;
    }

    /**
     * 计算角色的暴击伤害倍率<br/>
     * 计算方式: 1 + 暴击伤害
     *
     * @param panel 角色面板对象
     * @return 小数形式的角色暴击期望倍率
     */
    public static Double calCriDmg(Panel panel) {
        return 1.0 + panel.getCd() / 100.0;
    }

    /**
     * 计算角色面板的元素精通倍率<br/>
     * 剧变反应不吃增伤区<br/>
     * 计算方式: 反应基础倍率 * (1 + 精通提升 + 反应伤害,系数提升)
     *
     * @param panel        角色面板对象
     * @param reaInterface 反应接口
     * @return 小数形式的角色元素精通倍率
     */
    public static Double calElm(Panel panel, ReaInterface reaInterface) {
        return reaInterface.getReaRate().getRate() * (reaInterface.elmRate(panel) + reaInterface.getCoefficient() + 1.0);
    }
}
