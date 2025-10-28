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
@JsonClassDescription("Information about the project")
public class Project {

  @JsonPropertyDescription("Project name")
  String name;

  @JsonPropertyDescription("Project description: functionality and what it allows you to do")
  String description;

  @JsonPropertyDescription("Link to the project on github")
  String url;
}