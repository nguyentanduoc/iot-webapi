package vn.ctu.thud.ntd.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.ctu.thud.ntd.model.TypesSensor;
import vn.ctu.thud.ntd.service.TypesSensorService;

@RestController
@RequestMapping(path="typesSensor/")
public class HomeController {
		
	@Autowired private TypesSensorService typesSensorService;
	
	@PostMapping(path = "create")
	public TypesSensor create(@Valid @RequestBody TypesSensor typesSensor){
		this.typesSensorService.createOrUpdate(typesSensor);
		return typesSensor;
	}
	
	@GetMapping(path = "getAll")
	public List<TypesSensor> getAll(){
		return this.typesSensorService.findAll();
	}
	
	@GetMapping(path = "getById/{_id}")
	public TypesSensor getById(@PathVariable("_id") String _id){
		return this.typesSensorService.findBy_id(_id);
	}
}
