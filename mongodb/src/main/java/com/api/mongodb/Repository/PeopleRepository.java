package com.api.mongodb.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.api.mongodb.Collection.People;

@Repository
public interface PeopleRepository extends MongoRepository<People, String> {

}
