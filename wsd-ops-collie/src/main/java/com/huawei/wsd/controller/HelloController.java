package com.huawei.wsd.controller;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.routing.SmallestMailboxPool;
import com.huawei.wsd.akka.SpringExtension;
import com.huawei.wsd.dto.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ShiJie on 2018-06-23 16:54
 */
@RestController
public class HelloController {

    @Autowired
    private ActorSystem actorSystem;

    @Autowired
    private SpringExtension springExtension;

    @GetMapping("/wsd/hello")
    public String work(){
        ActorRef masterActor = actorSystem.actorOf(springExtension.props("masterActor")
//                .withDispatcher("requestDispatcher")
//                .withRouter(new SmallestMailboxPool(50000)),
                  , "masterActor"
            );

        System.out.println("into work function, ServerActorRef=" + masterActor.path());
        masterActor.tell(new Request(), ActorRef.noSender());

        return "Hello World!";
    }

}
