package vn.ctu.thud.ntd.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import vn.ctu.thud.ntd.model.Data;

public interface DataRepository extends MongoRepository<Data, String> {

}
