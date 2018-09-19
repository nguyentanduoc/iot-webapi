package vn.ctu.thud.ntd.component;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import vn.ctu.thud.ntd.common.MqttCommon;
import vn.ctu.thud.ntd.mqtt.MqttPushClient;

@Component
public class MqttComponent {

	@Autowired
	private MqttPushClient mqttPushClient;

	@PostConstruct
	public void init() {
		mqttPushClient.subscribe(MqttCommon.MQTT_SUB);
	}

}
