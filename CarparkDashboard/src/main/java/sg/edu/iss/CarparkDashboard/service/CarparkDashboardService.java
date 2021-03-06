package sg.edu.iss.CarparkDashboard.service;

import java.time.LocalDate;
import java.util.List;

import sg.edu.iss.CarparkDashboard.model.Carpark;

public interface CarparkDashboardService {
	public List<Carpark> findByCarparkAndDate(Carpark carpark, LocalDate date);
	public String[] buildTime();
	
	public List<Integer> getAvailablelots(List<Carpark>  carpark);
}
