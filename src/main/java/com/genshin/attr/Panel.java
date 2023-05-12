package com.genshin.attr;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * Panel
 * 角色面板区
 * 不计入充能,抗性,治疗加成,护盾强效
 *
 * @author LastRailgun
 * @version 1.0
 * @date 2023-05-06 06:41
 */
@Data
public class Panel {
    private Double hea = 0.0; // 生命值
    private Double atk = 0.0; // 攻击力
    private Double def = 0.0; // 防御力
    private Double elm = 0.0; // 元素精通
    private Double chr = 0.0; // 暴击率
    private Double cd = 0.0;  // 暴击伤害

    // 元素伤害和物伤字典,长度固定8
    // 键: 火 水 草 雷 风 冰 岩 物
    // 例: map.put("火","10.0");
    private Map<String, Double> atts = new HashMap<>(8);

    /**
     * 构造初始面板(除元素伤害和物伤)
     *
     * @param attributes 角色基础属性
     */
    public Panel(Double... attributes) {
        for (int i = 0; i < attributes.length; i++) {
            switch (i) {
                case 0:
                    hea = attributes[i];
                    continue;
                case 1:
                    atk = attributes[i];
                    continue;
                case 2:
                    def = attributes[i];
                    continue;
                case 3:
                    elm = attributes[i];
                    continue;
                case 4:
                    chr = attributes[i];
                    continue;
                case 5:
                    cd = attributes[i];
                    continue;
                default:
                    throw new RuntimeException("超出人物属性范围");
            }
        }
        // 设所有元素伤害和物伤默认为0
        this.atts.put("火", 0.0);
        this.atts.put("水", 0.0);
        this.atts.put("草", 0.0);
        this.atts.put("雷", 0.0);
        this.atts.put("风", 0.0);
        this.atts.put("冰", 0.0);
        this.atts.put("岩", 0.0);
        this.atts.put("物", 0.0);
    }

    /**
     * 构造元素伤害和物伤
     *
     * @param atts 元素伤害映射
     */
    public void setAtts(Map<String, Double> atts) {
        // 覆盖默认值
        Map<String, Double> temp = new HashMap<>(this.atts);
        atts.forEach((key, value) -> temp.merge(key, value, (v1, v2) -> v2));
        this.atts = temp;
    }
}
