package my.project.aigrg.model;

import com.fasterxml.jackson.annotation.JsonClassDescription;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonClassDescription("Information about completed courses")
public class Course {

  @JsonPropertyDescription("Course name")
  String name;

  @JsonPropertyDescription("Link to the course")
  String url;
}