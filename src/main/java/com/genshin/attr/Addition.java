package com.genshin.attr;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Addition
 * 增伤区
 *
 * @author LastRailgun
 * @version 1.0
 * @date 2023-05-13 06:25
 */
@Data
@AllArgsConstructor
public class Addition {
    private Double artifact;    // 圣遗物增伤, 如魔女2件套
    private Double weapon;      // 武器增伤, 如若水
    private Double teammate;    // 队友增伤, 如万叶天赋
}
