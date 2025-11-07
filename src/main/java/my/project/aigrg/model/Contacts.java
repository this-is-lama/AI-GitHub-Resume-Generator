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
@JsonClassDescription("Contact information")
public class Contacts {

	@JsonPropertyDescription("Email")
	String mail;

	@JsonPropertyDescription("Phone number")
	String phone;

	@JsonPropertyDescription("Links to other social networks")
	List<String> links;

	public String getMainContacts() {
		return phone + " | " + mail;
	}

	public String getTextLinks() {
		return String.join("\n", links);
	}
}