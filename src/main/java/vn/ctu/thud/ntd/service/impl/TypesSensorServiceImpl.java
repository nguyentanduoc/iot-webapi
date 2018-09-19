package vn.ctu.thud.ntd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.ctu.thud.ntd.model.TypesSensor;
import vn.ctu.thud.ntd.repository.TypesSensorRepository;
import vn.ctu.thud.ntd.service.TypesSensorService;

@Service
public class TypesSensorServiceImpl implements TypesSensorService{

	@Autowired protected TypesSensorRepository typesSensorRepo;
	
	@Override
	public List<TypesSensor> findAll() {
		return this.getTypesSensorRepo().findAll();
	}

	public TypesSensorRepository getTypesSensorRepo() {
		return typesSensorRepo;
	}

	public void setTypesSensorRepo(TypesSensorRepository typesSensorRepo) {
		this.typesSensorRepo = typesSensorRepo;
	}

	@Override
	public TypesSensor createOrUpdate(TypesSensor entity) {
		return this.getTypesSensorRepo().save(entity);
	}

	@Override
	public boolean delete(TypesSensor entity) {
		if(this.getTypesSensorRepo().existsById(entity.get_id())) {
			this.getTypesSensorRepo().delete(entity);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public TypesSensor findBy_id(String _id) {
		return this.getTypesSensorRepo().findBy_id(_id);
	}

}
