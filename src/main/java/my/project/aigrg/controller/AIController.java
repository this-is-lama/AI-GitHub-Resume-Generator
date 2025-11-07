package my.project.aigrg.controller;

import lombok.RequiredArgsConstructor;
import my.project.aigrg.service.OpenAiService;
import my.project.aigrg.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class AIController {

  private final OpenAiService aiService;

  private final ReportService reportService;

  @GetMapping("/generate")
  public ResponseEntity<byte[]> generate(@RequestParam(name = "url") String url) {
    var resumeData = aiService.generate(url);
    var report = reportService.generateResumeReport(resumeData);
    return ResponseEntity.ok()
            .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"resume.pdf\"")
            .contentType(MediaType.APPLICATION_PDF)
            .body(report);
  }
}