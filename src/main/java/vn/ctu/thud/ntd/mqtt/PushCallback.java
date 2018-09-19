package vn.ctu.thud.ntd.mqtt;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.SerializationUtils;

import vn.ctu.thud.ntd.model.Data;
import vn.ctu.thud.ntd.service.DataService;

public class PushCallback implements MqttCallback {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired DataService dataService;
	
	@Override
	public void connectionLost(Throwable cause) {
		logger.info("Connect fail...");
	}
	
	
	@Override
	public void messageArrived(String topic, MqttMessage message) throws Exception {
		if(topic.indexOf("SENDDATA")>0) {
			Data data = (Data) SerializationUtils.deserialize(message.getPayload());
		logger.info("data " + data.getValue());
			//this.getDataService().createOrUpdate(message.getPayload());
		}
		logger.info("topic: " + topic);
		logger.info("Qos : " + message.getQos());
		logger.info("payload : " + new String(message.getPayload()));

	}

	@Override
	public void deliveryComplete(IMqttDeliveryToken token) {
		System.out.println("deliveryComplete---------" + token.isComplete());
	}

	public DataService getDataService() {
		return dataService;
	}

	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}
	
}
