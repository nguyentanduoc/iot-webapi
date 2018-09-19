package vn.ctu.thud.ntd.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import vn.ctu.thud.ntd.model.Sensor;

public interface SensorRepository extends MongoRepository<Sensor, String> {
	
	
}
