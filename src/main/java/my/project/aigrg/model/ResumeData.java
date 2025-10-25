package my.project.aigrg.model;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ResumeData {

	PersonalInfo personalInfo;
	Contacts contacts;
	Education education;
	List<String> skills;

}
