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
@JsonClassDescription("General information about the resume")
public class ResumeData {

  PersonalInfo personalInfo;

  Contacts contacts;

  Optional<Education> education;

  @JsonPropertyDescription("List of skills")
  List<String> skills;

  Experience experience;
}