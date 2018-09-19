package vn.ctu.thud.ntd.service;

import java.util.List;

import vn.ctu.thud.ntd.model.Sensor;

public interface SensorService {

	public List<Sensor> findAll();
	
	public Sensor createOrUpdate(Sensor sensor);
	
	public boolean delete(Sensor sensor);
}
