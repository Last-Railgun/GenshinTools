package com.genshin.utils;

import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

/**
 * RbaseByLevel
 * 用于存放角色1-90级对应的反应基数<br/>
 * 数据来源 https://bbs.nga.cn/read.php?tid=25564438
 *
 * @author LastRailgun
 * @version 1.0
 * @date 2023-05-10 10:03
 */
@ToString
@NoArgsConstructor
public class RbaseByLevel {
    private static Map<Integer, Double> rbaseMap = null;

    static {
        RbaseByLevel.rbaseMap = new HashMap<>(90);
        rbaseMap.put(1, 17.17);
        rbaseMap.put(2, 18.54);
        rbaseMap.put(3, 19.90);
        rbaseMap.put(4, 21.27);
        rbaseMap.put(5, 22.65);
        rbaseMap.put(6, 24.65);
        rbaseMap.put(7, 26.64);
        rbaseMap.put(8, 28.87);
        rbaseMap.put(9, 31.37);
        rbaseMap.put(10, 34.14);

        rbaseMap.put(11, 37.20);
        rbaseMap.put(12, 40.66);
        rbaseMap.put(13, 44.45);
        rbaseMap.put(14, 48.56);
        rbaseMap.put(15, 53.75);
        rbaseMap.put(16, 59.08);
        rbaseMap.put(17, 64.42);
        rbaseMap.put(18, 69.72);
        rbaseMap.put(19, 75.12);
        rbaseMap.put(20, 80.58);

        rbaseMap.put(21, 86.11);
        rbaseMap.put(22, 91.70);
        rbaseMap.put(23, 97.24);
        rbaseMap.put(24, 102.81);
        rbaseMap.put(25, 108.41);
        rbaseMap.put(26, 113.20);
        rbaseMap.put(27, 118.10);
        rbaseMap.put(28, 122.98);
        rbaseMap.put(29, 129.73);
        rbaseMap.put(30, 136.29);

        rbaseMap.put(31, 142.67);
        rbaseMap.put(32, 149.03);
        rbaseMap.put(33, 155.42);
        rbaseMap.put(34, 161.83);
        rbaseMap.put(35, 169.11);
        rbaseMap.put(36, 176.52);
        rbaseMap.put(37, 184.07);
        rbaseMap.put(38, 191.71);
        rbaseMap.put(39, 199.56);
        rbaseMap.put(40, 207.38);

        rbaseMap.put(41, 215.40);
        rbaseMap.put(42, 224.17);
        rbaseMap.put(43, 233.50);
        rbaseMap.put(44, 243.35);
        rbaseMap.put(45, 256.06);
        rbaseMap.put(46, 268.54);
        rbaseMap.put(47, 281.53);
        rbaseMap.put(48, 295.01);
        rbaseMap.put(49, 309.07);
        rbaseMap.put(50, 323.60);

        rbaseMap.put(51, 336.76);
        rbaseMap.put(52, 350.53);
        rbaseMap.put(53, 364.48);
        rbaseMap.put(54, 378.62);
        rbaseMap.put(55, 398.60);
        rbaseMap.put(56, 416.40);
        rbaseMap.put(57, 434.39);
        rbaseMap.put(58, 452.57);
        rbaseMap.put(59, 471.43);
        rbaseMap.put(60, 490.48);

        rbaseMap.put(61, 513.57);
        rbaseMap.put(62, 539.10);
        rbaseMap.put(63, 565.51);
        rbaseMap.put(64, 592.54);
        rbaseMap.put(65, 624.44);
        rbaseMap.put(66, 651.47);
        rbaseMap.put(67, 679.50);
        rbaseMap.put(68, 707.79);
        rbaseMap.put(69, 736.67);
        rbaseMap.put(70, 765.64);

        rbaseMap.put(71, 794.77);
        rbaseMap.put(72, 824.68);
        rbaseMap.put(73, 851.16);
        rbaseMap.put(74, 877.74);
        rbaseMap.put(75, 914.23);
        rbaseMap.put(76, 946.75);
        rbaseMap.put(77, 979.41);
        rbaseMap.put(78, 1011.22);
        rbaseMap.put(79, 1044.79);
        rbaseMap.put(80, 1077.44);

        rbaseMap.put(81, 1110.00);
        rbaseMap.put(82, 1142.98);
        rbaseMap.put(83, 1176.37);
        rbaseMap.put(84, 1210.18);
        rbaseMap.put(85, 1253.84);
        rbaseMap.put(86, 1288.95);
        rbaseMap.put(87, 1325.48);
        rbaseMap.put(88, 1363.46);
        rbaseMap.put(89, 1405.10);
        rbaseMap.put(90, 1446.85);
    }
}
