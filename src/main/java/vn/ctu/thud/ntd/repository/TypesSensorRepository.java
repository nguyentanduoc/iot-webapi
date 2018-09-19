package vn.ctu.thud.ntd.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import vn.ctu.thud.ntd.model.TypesSensor;

public interface TypesSensorRepository extends MongoRepository<TypesSensor, String> {

	public TypesSensor findBy_id(String id);
}
