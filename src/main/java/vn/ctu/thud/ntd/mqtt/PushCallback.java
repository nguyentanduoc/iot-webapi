package vn.ctu.thud.ntd.mqtt;

import java.io.IOException;
import java.util.Date;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

import vn.ctu.thud.ntd.model.Data;

public class PushCallback implements MqttCallback {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public void connectionLost(Throwable cause) {
		logger.info("连接断开，可以做重连");
	}

	@Override
	public void messageArrived(String topic, MqttMessage message) throws Exception {
		
		logger.info("topic : " + topic);
		logger.info("Qos : " + message.getQos());
		logger.info("payload : " + new String(message.getPayload()));
		saveData(topic, message);
	}

	@Override
	public void deliveryComplete(IMqttDeliveryToken token) {
		System.out.println("deliveryComplete---------" + token.isComplete());
	}
	
	public void saveData(String topic, MqttMessage message) {
		if(topic.contains("ESP8266/SENDDATA")) {
			Data data;
			try {
				data = new ObjectMapper().readValue(new String(message.getPayload()), Data.class);
				data.setUpdateDate(new Date());
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}else {
			logger.info("topic : " + topic);
			logger.info("Qos : " + message.getQos());
			logger.info("payload : " + new String(message.getPayload()));
		}
	}
}
