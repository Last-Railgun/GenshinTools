package com.genshin.test;

import com.genshin.obj.Panel;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Test1
 *
 * @author LastRailgun
 * @version 1.0
 * @date 2023-05-07 07:38
 */

public class Test1 {
    @Test
    public void test1() {
        Panel panel = new Panel(10.0, 11.0, 12.0, 13.0, 0.0, 15.0);
        Map<String, Double> atts = new HashMap<>();
        atts.put("火", 10.0);
        atts.put("冰", 11.0);
        panel.setAtts(atts);
        System.out.println(panel);
    }
}
