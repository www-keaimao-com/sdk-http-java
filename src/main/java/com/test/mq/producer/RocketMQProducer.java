package com.test.mq.producer;

import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;

public class RocketMQProducer {

    // private static final Logger logger =
    // LoggerFactory.getLogger(RocketMQProducer.class);

    private DefaultMQProducer defaultMQProducer;
    private String producerGroup;
    private String namesrvAddr;
    //private String instanceName;
    //private int retryTimes;

    public void init() throws MQClientException {
        this.defaultMQProducer = new DefaultMQProducer(this.producerGroup);
        defaultMQProducer.setNamesrvAddr(this.namesrvAddr);
        //defaultMQProducer.setInstanceName(this.instanceName);
        //defaultMQProducer.setRetryTimesWhenSendFailed(this.retryTimes);
        defaultMQProducer.start();
        // logger.info("rocketMQ初始化生产者完成[producerGroup：" + producerGroup +
        // "，instanceName：" + instanceName + "]");
    }

    public void destroy() {
        defaultMQProducer.shutdown();
        // logger.info("rocketMQ生产者[producerGroup: " + producerGroup +
        // ",instanceName: " + instanceName + "]已停止");
    }

    public DefaultMQProducer getDefaultMQProducer() {
        return defaultMQProducer;
    }

    public void setProducerGroup(String producerGroup) {
        this.producerGroup = producerGroup;
    }

    public void setNamesrvAddr(String namesrvAddr) {
        this.namesrvAddr = namesrvAddr;
    }

    public void setInstanceName(String instanceName) {
        //this.instanceName = instanceName;
    }

    public void setRetryTimes(int retryTimes) {
        //this.retryTimes = retryTimes;
    }
}
