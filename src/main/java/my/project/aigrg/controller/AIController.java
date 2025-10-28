package my.project.aigrg.controller;

import lombok.RequiredArgsConstructor;

import my.project.aigrg.model.ResumeData;
import my.project.aigrg.service.OpenAiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class AIController {

  private final OpenAiService service;

  @GetMapping("/generate")
  public ResumeData generate(@RequestParam(name = "url") String url) {
    return service.generate(url);
  }
}