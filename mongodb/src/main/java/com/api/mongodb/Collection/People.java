package com.api.mongodb.Collection;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "people")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class People {

  @Id
  private String peopleId;
  private String firstName;
  private String lastname;
  private Integer age;
  private List<String> hobbies;
  private List<Address> address;

}
