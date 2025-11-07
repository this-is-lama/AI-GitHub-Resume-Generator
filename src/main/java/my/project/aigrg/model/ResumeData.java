package my.project.aigrg.model;


import com.fasterxml.jackson.annotation.JsonClassDescription;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonClassDescription("General information about the resume")
public class ResumeData {

	PersonalInfo personalInfo;

	Contacts contacts;

	@JsonIgnore
	Education education;

	@JsonIgnore
	List<Course> courses;

	@JsonPropertyDescription("List of skills")
	List<String> skills;

	Experience experience;

	public String getTextCourses() {
		var textCourses = courses.stream().map(Course::getTextCourse).toList();
		return String.join("\n", textCourses);
	}
}