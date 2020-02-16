package com.test.controller;


import com.test.model.User;
import com.test.mq.producer.RocketMQProducer;
import com.test.service.user.UserService;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class TestMq {

    @Autowired(required = false)
    @Qualifier("rocketMQProducer")
    private RocketMQProducer producer;

    private static  final String topic = "xdclass_pay_test_topic2";

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/ps")
    public Object push(){

        for (int i = 0; i < 1; i++) {
            Message msg = new Message("TestTopic1", "TAG1", (i + "這是spring集成").getBytes());
            SendResult result = null;
            //Object rocketMQProducer = SpringContext.getBean("rocketMQProducer");
            //defaultMQProducer = (DefaultMQProducer)SpringContext.getBean("rocketMQProducer");
            DefaultMQProducer defaultMQProducer = producer.getDefaultMQProducer();
            User user = new User();
            user.setNickname("文卓");
            user.setSex(1);
            user.setStatus(10);
            //userService.add(user);
            try {
                result = defaultMQProducer.send(msg);
            } catch (MQClientException e) {
                e.printStackTrace();
            } catch (RemotingException e) {
                e.printStackTrace();
            } catch (MQBrokerException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(result);
        }
        String result = "add ok";
        return result;
    }

}
