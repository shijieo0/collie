package com.huawei.wsd.akka;

import akka.actor.Extension;
import akka.actor.Props;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by ShiJie on 2018-06-24 22:12
 */
@Component("springExtension")
public class SpringExtension implements Extension {
    private ApplicationContext applicationContext;

    public void initialize(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public Props props(String actorBeanName, Object ... args) {
        return Props.create(SpringActorProducer.class, applicationContext, actorBeanName, args);
    }
}
