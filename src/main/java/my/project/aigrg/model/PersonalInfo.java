package my.project.aigrg.model;

import com.fasterxml.jackson.annotation.JsonClassDescription;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Optional;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonClassDescription("Main information about person")
public class PersonalInfo {

  @JsonPropertyDescription("The name of the person")
  String name;

  @JsonPropertyDescription("The surname of the person")
  String surname;

  @JsonPropertyDescription("The information about person")
  Optional<String> aboutMe;
}