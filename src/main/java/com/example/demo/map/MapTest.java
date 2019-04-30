package com.example.demo.map;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Auther: zhangliang
 * @Date: 2019/4/30 11:10
 * @Description:
 */
public class MapTest {

    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        Map<String, String> map = new HashMap<>();
        map.put("aaa", "111");
        map.put("bbb", "222");
        map.put("ccc", "333");
        Set<String> key1 = map.keySet();
        Set<String> key2 = map.keySet();
        System.out.println(JSON.toJSONString(key1));
        System.out.println(JSON.toJSONString(key2));
        key1.remove("ccc");
        System.out.println(JSON.toJSONString(key1));
        System.out.println(JSON.toJSONString(key2));
        System.out.println(JSON.toJSONString(map));
    }

}
