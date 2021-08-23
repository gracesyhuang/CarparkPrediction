package sg.edu.iss.carparkPrediction.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.iss.carparkPrediction.Repository.carparkPredictionRepository;
import sg.edu.iss.carparkPrediction.model.Carpark;


@Service
public class carparkPredictionServiceImpl implements carparkPredictionService {
	
	@Autowired
	carparkPredictionRepository cpprepo;
	
//	public List<Carpark> findByCarparkAndDate( Carpark carpark,LocalDate date) {
//		return cpprepo.findByCarparkAndDate(carpark, date);
//	}

	public List<Carpark> findCarparkByAddressAndDate(String address, LocalDate date)
	{
		return cpprepo.findCarparkByAddressAndDate(address, date);
	}



}
