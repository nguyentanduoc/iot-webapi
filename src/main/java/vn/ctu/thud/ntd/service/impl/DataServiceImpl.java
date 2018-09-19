package vn.ctu.thud.ntd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.ctu.thud.ntd.model.Data;
import vn.ctu.thud.ntd.repository.DataRepository;
import vn.ctu.thud.ntd.service.DataService;

@Service
public class DataServiceImpl implements DataService {

	@Autowired
	DataRepository dataRepository;

	@Override
	public Data createOrUpdate(Data data) {
		return this.getDataRepository().save(data);
	}

	public DataRepository getDataRepository() {
		return dataRepository;
	}

	public void setDataRepository(DataRepository dataRepository) {
		this.dataRepository = dataRepository;
	}
	
	
}
