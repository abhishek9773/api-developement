package com.api.mongodb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.mongodb.Collection.People;
import com.api.mongodb.Service.PeopleService;

@RestController
@RequestMapping("/people")
public class PeopleController {

  @Autowired
  private PeopleService peopleService;

  @PostMapping()
  public String save(@RequestBody People people) {
    return peopleService.save(people);
  }

}
