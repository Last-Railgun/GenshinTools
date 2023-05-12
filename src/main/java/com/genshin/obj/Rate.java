package com.genshin.obj;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Rate
 * 角色倍率区
 *
 * @author LastRailgun
 * @version 1.0
 * @date 2023-05-08 08:46
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Rate {
    private Double rate;    // 角色技能倍率,如100%赋值100.0
    // 倍率对应面板属性
    // hea: 生命值
    // atk: 攻击力
    // def: 防御力
    // elm: 元素精通
    private String mode;
}
