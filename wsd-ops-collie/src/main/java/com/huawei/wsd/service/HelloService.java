package com.huawei.wsd.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by ShiJie on 2018-06-24 23:35
 */
@Service
public class HelloService {

    private final static Logger LOGGER = LoggerFactory.getLogger(HelloService.class);

    public void perform(Object o) {
        LOGGER.info("Perform: {}", o);
    }

}
