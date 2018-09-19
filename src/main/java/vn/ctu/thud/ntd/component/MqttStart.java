package vn.ctu.thud.ntd.component;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import vn.ctu.thud.ntd.mqtt.MqttPushClient;

@Component
public class MqttStart {
	
	@Autowired
	private MqttPushClient mqttPushClient;

    @PostConstruct
    public void init(){
    	String kdTopic = "esp8266";
		mqttPushClient.publish(0, false, kdTopic, "15345715326");
		mqttPushClient.subscribe(kdTopic);
    }
	
}
