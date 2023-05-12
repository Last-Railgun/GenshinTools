package com.genshin.utils;

import com.genshin.obj.Panel;
import com.genshin.obj.Rate;

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
     * 计算基础伤害,计算方式为角色属性*面板倍率
     *
     * @param panel 角色面板对象
     * @param rate  角色倍率对象
     * @param mode  选择倍率 atk:攻击 hea:生命 def:防御 elm:元素精通
     * @return 基础伤害
     */
    public static Double calBasicDmg(Panel panel, Rate rate, String mode) {
        return panel.getAtk() * rate.getRate() / 100.0;
    }

    /**
     * 计算基础伤害,多重倍率计算,如草神灭净三业
     *
     * @param panel 角色面板对象
     * @param rates 角色倍率数组
     * @return 基础伤害
     */
    public static Double calBasicDmg(Panel panel, Rate... rates) {
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
     * 计算角色的暴击期望倍率
     *
     * @param panel 角色面板对象
     * @return 小数形式的角色暴击期望倍率
     */
    public static Double calDesire(Panel panel) {
        return (100.0 + panel.getChr() * panel.getCd()) / 100.0;
    }
}
