package vn.ctu.thud.ntd.controller;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.ctu.thud.ntd.model.Sensor;
import vn.ctu.thud.ntd.service.SensorService;

@RestController
@RequestMapping(path = "sensor/")
public class SensorController {
	
	@Autowired SensorService sensorService;
	
	@PostMapping(path = "create")
	public Sensor create(@Valid @RequestBody Sensor sensor) {
		sensor.setDateCreate(new Date());
		return this.sensorService.createOrUpdate(sensor);
	}
	
	@GetMapping(path = "getAll")
	public List<Sensor> getAll(){
		return this.sensorService.findAll();
	}
}
