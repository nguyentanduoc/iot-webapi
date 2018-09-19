package vn.ctu.thud.ntd.service;

import java.util.List;

import vn.ctu.thud.ntd.model.TypesSensor;

public interface TypesSensorService {
	
	public List<TypesSensor> findAll();
	
	public TypesSensor findBy_id(String _id);
	
	public TypesSensor createOrUpdate(TypesSensor entity);
	
	public boolean delete(TypesSensor entity);
}
