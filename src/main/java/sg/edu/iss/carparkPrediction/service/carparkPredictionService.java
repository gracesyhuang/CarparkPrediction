package sg.edu.iss.carparkPrediction.service;

import java.time.LocalDate;
import java.util.List;

import sg.edu.iss.carparkPrediction.model.Carpark;

public interface carparkPredictionService {
	
//	public List<Carpark> findByCarparkAndDate(Carpark carpark, LocalDate date);
	public List<Carpark> findCarparkByAddressAndDate(String address, LocalDate date);

}
