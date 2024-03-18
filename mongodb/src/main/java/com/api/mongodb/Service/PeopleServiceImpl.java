package com.api.mongodb.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.mongodb.Collection.People;
import com.api.mongodb.Repository.PeopleRepository;

@Service
public class PeopleServiceImpl implements PeopleService {

  @Autowired
  private PeopleRepository peopleRepo;

  @Override
  public String save(People people) {
    return peopleRepo.save(people).getPeopleId();
  }

}
