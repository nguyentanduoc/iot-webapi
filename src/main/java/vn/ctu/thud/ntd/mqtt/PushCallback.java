package vn.ctu.thud.ntd.mqtt;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PushCallback implements MqttCallback {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public void connectionLost(Throwable cause) {
		logger.info("连接断开，可以做重连");
	}

	@Override
	public void messageArrived(String topic, MqttMessage message) throws Exception {

		logger.info("接收消息主题 : " + topic);
		logger.info("接收消息Qos : " + message.getQos());
		logger.info("接收消息内容 : " + new String(message.getPayload()));

	}

	@Override
	public void deliveryComplete(IMqttDeliveryToken token) {
		System.out.println("deliveryComplete---------" + token.isComplete());
	}

}
