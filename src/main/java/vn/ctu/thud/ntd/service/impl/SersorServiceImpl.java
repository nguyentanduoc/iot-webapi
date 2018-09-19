package vn.ctu.thud.ntd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.ctu.thud.ntd.model.Sensor;
import vn.ctu.thud.ntd.repository.SensorRepository;
import vn.ctu.thud.ntd.service.SensorService;

@Service
public class SersorServiceImpl implements SensorService{

	@Autowired
	protected SensorRepository sensorRepo;
	
	@Override
	public List<Sensor> findAll() {
		return this.getSensorRepo().findAll();
	}
	
	@Override
	public Sensor createOrUpdate(Sensor sensor) {
		return this.getSensorRepo().save(sensor);
	}

	@Override
	public boolean delete(Sensor sensor) {
		if(this.getSensorRepo().existsById(sensor.get_id())) {
			this.getSensorRepo().delete(sensor);
			return true;
		}
		else {
			return false;
		}
	}	
	
	public SensorRepository getSensorRepo() {
		return sensorRepo;
	}

	public void setSensorRepo(SensorRepository sensorRepo) {
		this.sensorRepo = sensorRepo;
	}
	
}
