package com.genshin.attr;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Resistance
 * 怪物抗性区
 *
 * @author LastRailgun
 * @version 1.0
 * @date 2023-05-14 11:26
 */
@Data
@AllArgsConstructor
public class Resistance {
    private Double monsterRes;  // 怪物抗性
    private Double reduce;      // 减少抗性
}
