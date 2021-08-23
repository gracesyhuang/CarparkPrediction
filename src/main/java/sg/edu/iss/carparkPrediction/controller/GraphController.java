package sg.edu.iss.carparkPrediction.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import sg.edu.iss.carparkPrediction.Repository.carparkPredictionRepository;
import sg.edu.iss.carparkPrediction.model.Carpark;
import sg.edu.iss.carparkPrediction.service.carparkPredictionService;



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
	
	@Autowired
	carparkPredictionService cpservice;

	@RequestMapping("/displayBarGraph")
	public String barGraph(Model model) {
		Map<String, Integer> surveyMap = new LinkedHashMap<>();
		List<Carpark> carpark = new ArrayList<Carpark>();
		carpark = cpservice.findCarparkByAddressAndDate("Westgate", LocalDate.of(2021, 8, 1));
		for (int i = 0; i < carpark.size(); i++) {
			String time1 = carpark.get(i).getTime();
			int availableLots = carpark.get(i).getAvailableLots();
			surveyMap.put(time1, availableLots);
		}
//		surveyMap.put("Java",40);
//		surveyMap.put("Dev ops", 25);
//		surveyMap.put("Python",20);
//		surveyMap.put(".NET", 15);
		model.addAttribute("surveyMap",surveyMap);
		
		List<String> daylist = new ArrayList<String>();
		for (Carpark c: carpark)
		{
			String time = c.getTime();
			daylist.add(time);
		}
		
//		String array[] = new String[4];
//		for (int i =0; i<array.length; i++) {
//			array[i] = String.valueOf(i)
//		}
		model.addAttribute("timelist",daylist);
		
//		Map<String, Integer> surveyMap1 = new LinkedHashMap<>();
//		surveyMap1.put("Jan", 10);
//		surveyMap1.put("Feb", 20);
//		surveyMap1.put("Mar", 30);
//		surveyMap1.put("Apr", 40);
//		surveyMap1.put("May", 50);
//		model.addAttribute("surveyMap1", surveyMap1);
//
//		int sum = surveyMap1.size();
//		String array1[] = new String[sum];
//		for (int i = 0; i<array1.length; i++) {
//		array1[i] = String.valueOf(i);
//		}
//		model.addAttribute("timelist1", array1);
//		json.add("time", jsonTime);
//		json.add("lots", jsonLots);
//		json.toString();
		
		
		
		return "barGraph";
	}
	
	
}
