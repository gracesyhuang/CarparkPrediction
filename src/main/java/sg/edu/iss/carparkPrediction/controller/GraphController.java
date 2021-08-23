package sg.edu.iss.carparkPrediction.controller;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//@RestController
//public class GraphController {
//    @GetMapping("/get-data")
//    public ResponseEntity<Map<String, Integer>> getPieChart() {
//        Map<String, Integer> graphData = new TreeMap<>();
//        graphData.put("2016", 147);
//        graphData.put("2017", 1256);
//        graphData.put("2018", 3856);
//        graphData.put("2019", 19807);
//        return new ResponseEntity<>(graphData, HttpStatus.OK);
//    }
//}


@Controller
class GraphController{

	@GetMapping("/displayBarGraph")
	public String barGraph(Model model) {
		Map<String, Integer> surveyMap = new LinkedHashMap<>();
		surveyMap.put("Java",40);
		surveyMap.put("Dev ops", 25);
		surveyMap.put("Python",20);
		surveyMap.put(".NET", 15);
		model.addAttribute("surveyMap",surveyMap);
		
		String array[] = new String[4];
		for (int i =0; i<array.length; i++) {
			array[i] = String.valueOf(i);
		}
		model.addAttribute("timelist",array);
		
		return "barGraph";
	}
	
	
}
