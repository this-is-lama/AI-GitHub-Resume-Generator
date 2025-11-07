package my.project.aigrg.service;

import lombok.SneakyThrows;
import my.project.aigrg.model.ResumeData;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReportService {

	@Value("classpath:/resume.jrxml")
	private Resource reportTemplate;

	@SneakyThrows
	public byte[] generateResumeReport(ResumeData data) {
		JasperReport jasperReport = JasperCompileManager.compileReport(reportTemplate.getInputStream());
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(Collections.singletonList(data));
		var params = createParams(data);
		JasperPrint print = JasperFillManager.fillReport(jasperReport, params, dataSource);
		return JasperExportManager.exportReportToPdf(print);
	}

	private Map<String, Object> createParams(ResumeData data) {
		List<String> skills = data.getSkills();
		int middle = (int) Math.ceil(skills.size() / 2.0);

		String leftSkills = String.join("\n", skills.subList(0, middle));
		String rightSkills = String.join("\n", skills.subList(middle, skills.size()));

		Map<String, Object> params = new HashMap<>();
		params.put("courses", data.getTextCourses());
		params.put("leftSkills", leftSkills);
		params.put("rightSkills", rightSkills);
		return params;
	}
}