package com.genshin.utils;

import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

/**
 * UpheavalRateLevel
 * 用于存放角色1-90级对应的反应基数<br/>
 * 数据来源 https://bbs.nga.cn/read.php?tid=25564438
 *
 * @author LastRailgun
 * @version 1.0
 * @date 2023-05-10 10:03
 */
@ToString
public class UpheavalRateLevel {
    private static Map<Integer, Double> rateLevelMap = null;

    static {
        UpheavalRateLevel.rateLevelMap = new HashMap<>(90);
        rateLevelMap.put(1, 17.17);
        rateLevelMap.put(2, 18.54);
        rateLevelMap.put(3, 19.90);
        rateLevelMap.put(4, 21.27);
        rateLevelMap.put(5, 22.65);
        rateLevelMap.put(6, 24.65);
        rateLevelMap.put(7, 26.64);
        rateLevelMap.put(8, 28.87);
        rateLevelMap.put(9, 31.37);
        rateLevelMap.put(10, 34.14);

        rateLevelMap.put(11, 37.20);
        rateLevelMap.put(12, 40.66);
        rateLevelMap.put(13, 44.45);
        rateLevelMap.put(14, 48.56);
        rateLevelMap.put(15, 53.75);
        rateLevelMap.put(16, 59.08);
        rateLevelMap.put(17, 64.42);
        rateLevelMap.put(18, 69.72);
        rateLevelMap.put(19, 75.12);
        rateLevelMap.put(20, 80.58);

        rateLevelMap.put(21, 86.11);
        rateLevelMap.put(22, 91.70);
        rateLevelMap.put(23, 97.24);
        rateLevelMap.put(24, 102.81);
        rateLevelMap.put(25, 108.41);
        rateLevelMap.put(26, 113.20);
        rateLevelMap.put(27, 118.10);
        rateLevelMap.put(28, 122.98);
        rateLevelMap.put(29, 129.73);
        rateLevelMap.put(30, 136.29);

        rateLevelMap.put(31, 142.67);
        rateLevelMap.put(32, 149.03);
        rateLevelMap.put(33, 155.42);
        rateLevelMap.put(34, 161.83);
        rateLevelMap.put(35, 169.11);
        rateLevelMap.put(36, 176.52);
        rateLevelMap.put(37, 184.07);
        rateLevelMap.put(38, 191.71);
        rateLevelMap.put(39, 199.56);
        rateLevelMap.put(40, 207.38);

        rateLevelMap.put(41, 215.40);
        rateLevelMap.put(42, 224.17);
        rateLevelMap.put(43, 233.50);
        rateLevelMap.put(44, 243.35);
        rateLevelMap.put(45, 256.06);
        rateLevelMap.put(46, 268.54);
        rateLevelMap.put(47, 281.53);
        rateLevelMap.put(48, 295.01);
        rateLevelMap.put(49, 309.07);
        rateLevelMap.put(50, 323.60);

        rateLevelMap.put(51, 336.76);
        rateLevelMap.put(52, 350.53);
        rateLevelMap.put(53, 364.48);
        rateLevelMap.put(54, 378.62);
        rateLevelMap.put(55, 398.60);
        rateLevelMap.put(56, 416.40);
        rateLevelMap.put(57, 434.39);
        rateLevelMap.put(58, 452.57);
        rateLevelMap.put(59, 471.43);
        rateLevelMap.put(60, 490.48);

        rateLevelMap.put(61, 513.57);
        rateLevelMap.put(62, 539.10);
        rateLevelMap.put(63, 565.51);
        rateLevelMap.put(64, 592.54);
        rateLevelMap.put(65, 624.44);
        rateLevelMap.put(66, 651.47);
        rateLevelMap.put(67, 679.50);
        rateLevelMap.put(68, 707.79);
        rateLevelMap.put(69, 736.67);
        rateLevelMap.put(70, 765.64);

        rateLevelMap.put(71, 794.77);
        rateLevelMap.put(72, 824.68);
        rateLevelMap.put(73, 851.16);
        rateLevelMap.put(74, 877.74);
        rateLevelMap.put(75, 914.23);
        rateLevelMap.put(76, 946.75);
        rateLevelMap.put(77, 979.41);
        rateLevelMap.put(78, 1011.22);
        rateLevelMap.put(79, 1044.79);
        rateLevelMap.put(80, 1077.44);

        rateLevelMap.put(81, 1110.00);
        rateLevelMap.put(82, 1142.98);
        rateLevelMap.put(83, 1176.37);
        rateLevelMap.put(84, 1210.18);
        rateLevelMap.put(85, 1253.84);
        rateLevelMap.put(86, 1288.95);
        rateLevelMap.put(87, 1325.48);
        rateLevelMap.put(88, 1363.46);
        rateLevelMap.put(89, 1405.10);
        rateLevelMap.put(90, 1446.85);
    }
}
