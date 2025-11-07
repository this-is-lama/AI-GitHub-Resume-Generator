package my.project.aigrg.service;

import com.openai.client.OpenAIClient;
import com.openai.models.chat.completions.ChatCompletionCreateParams;
import lombok.RequiredArgsConstructor;
import my.project.aigrg.model.ResumeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class OpenAiService  {

	private final OpenAIClient client;

	@Value("${prompt.text}")
	private String prompt;

	@Value("${model.name}")
	private String model;

	public ResumeData generate(String url) {
		var params = ChatCompletionCreateParams.builder()
				.addUserMessage(createPrompt(url))
				.responseFormat(ResumeData.class)
				.model(model)
				.build();
		var chat = client.chat().completions().create(params);
		var content = chat.choices().getFirst().message().content();
		return content.orElse(null);
	}

	private String createPrompt(String url) {
		return prompt.formatted(url);
	}

}