package com.model;

import java.util.HashMap;
import java.util.Map;

public class MapIterate {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.forEach((cost, am) -> System.out.println(cost + " " + am));
    }
}
