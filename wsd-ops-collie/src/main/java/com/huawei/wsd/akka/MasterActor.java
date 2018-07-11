package com.huawei.wsd.akka;

import akka.actor.UntypedAbstractActor;
import com.huawei.wsd.dto.Request;
import com.huawei.wsd.dto.Response;
import com.huawei.wsd.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by ShiJie on 2018-06-24 23:20
 */
@Component("masterActor")
@Scope("prototype")
public class MasterActor extends UntypedAbstractActor {

    @Autowired
    private HelloService helloService;

    private int count = 0;

    @Override
    public void onReceive(Object message) throws Throwable {
        if (message instanceof Request) {
            helloService.perform(this + " " + (++count));
        } else if (message instanceof Response) {
            getSender().tell(count, getSelf());
        } else {
            unhandled(message);
        }
    }
}
