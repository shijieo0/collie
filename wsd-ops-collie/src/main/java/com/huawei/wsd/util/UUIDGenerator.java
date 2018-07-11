package com.huawei.wsd.util;

import java.util.UUID;

/**
 * Created by ShiJie on 2018-06-28 10:07
 */
public class UUIDGenerator {

    public static String getUUID(){
        return UUID.randomUUID().toString();
    }

    public static void main(String[] args) {
        System.out.println(UUIDGenerator.getUUID());
    }
}
