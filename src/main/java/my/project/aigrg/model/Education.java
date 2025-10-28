package my.project.aigrg.model;

import com.fasterxml.jackson.annotation.JsonClassDescription;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.Optional;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonClassDescription("Information about education of the person")
public class Education {

  @JsonPropertyDescription("Name of the educational institution")
  Optional<String> name;

  @JsonPropertyDescription("The year of the beginning of Education")
  Optional<Integer> startYear;

  @JsonPropertyDescription("Year of graduation")
  Optional<Integer> endYear;

  @JsonPropertyDescription("Faculty name")
  Optional<String> faculty;

  @JsonPropertyDescription("List of completed courses")
  Optional<List<Course>> courses;

}