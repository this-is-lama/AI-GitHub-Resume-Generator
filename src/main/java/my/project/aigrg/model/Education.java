package my.project.aigrg.model;

import com.fasterxml.jackson.annotation.JsonClassDescription;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Objects;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonClassDescription("Information about education of the person")
public class Education {

	@JsonPropertyDescription("Name of the educational institution")
	String name;

	@JsonPropertyDescription("The year of the beginning of Education")
	Integer startYear;

	@JsonPropertyDescription("Year of graduation")
	Integer endYear;

	@JsonPropertyDescription("Faculty name")
	String faculty;

	public String getTextEducation() {
		return String.join("\n",
				Objects.toString(name, ""),
				(startYear != null && endYear != null) ? startYear + " - " + endYear : "",
				Objects.toString(faculty, "")
		).trim();
	}
}