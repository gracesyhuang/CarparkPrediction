package sg.edu.iss.CarparkDashboard.controller;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import sg.edu.iss.CarparkDashboard.model.Carpark;
import sg.edu.iss.CarparkDashboard.service.CarparkDashboardService;

@Controller
public class ChartController {
	
	@Autowired
	CarparkDashboardService cdservice;
	
	@GetMapping("/displayBarGraph")
	public String barGraph(Model model) {
//		Map<String, Integer> surveyMap = new LinkedHashMap<>();
//		surveyMap.put("Java",40);
//		surveyMap.put("Dev ops", 25);
//		surveyMap.put("Python",20);
//		surveyMap.put(".NET", 15);
		Carpark carpark = new Carpark ("Westgate");
		List<Carpark> carparklist = cdservice.findByCarparkAndDate(carpark, LocalDate.now());
	 carparklist = carparklist.stream().filter(x->x.getDatetime().getMinute() == 0).collect(Collectors.toList());
		
	 List<Integer>test = cdservice.getAvailablelots(carparklist);
		String[] timeline = cdservice.buildTime();
		model.addAttribute("timeline",timeline);
//		model.addAttribute("surveyMap",surveyMap);
		return "barGraph";
	}
}
