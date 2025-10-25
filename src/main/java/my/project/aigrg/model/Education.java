package my.project.aigrg.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Map;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Education {

	String name;
	Integer startYear;
	Integer endYear;
	String faculty;
	Map<String, String> courses;
}
