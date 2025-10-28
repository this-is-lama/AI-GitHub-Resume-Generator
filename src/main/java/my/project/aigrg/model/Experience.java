package my.project.aigrg.model;

import com.fasterxml.jackson.annotation.JsonClassDescription;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonClassDescription("General information about the entire development experience")
public class Experience {

  @JsonPropertyDescription("Profession name")
  String name;

  @JsonPropertyDescription("List of technologies used in projects")
  List<String> technologies;

  @JsonPropertyDescription("1-3 of the most interesting human projects")
  List<Project> projects;
}