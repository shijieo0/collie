package com.huawei.wsd.akka;

import akka.actor.UntypedAbstractActor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by ShiJie on 2018-06-25 00:03
 */
@Component("responseDispatchActor")
@Scope("prototype")
public class ResponseDispatchActor extends UntypedAbstractActor {

    public ResponseDispatchActor() {

    }

    @Override
    public void onReceive(Object message) throws Throwable {

    }

}
