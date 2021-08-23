package sg.edu.iss.CarparkDashboard.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.iss.CarparkDashboard.model.Carpark;
import sg.edu.iss.CarparkDashboard.repo.CarparkDashboardRepository;

@Service
public class CarparkDashboardServiceImpl implements CarparkDashboardService {

	@Autowired
	CarparkDashboardRepository cdrepo;

	@Override
	public List<Carpark> findByCarparkAndDate( Carpark carpark,LocalDate date) {
		return cdrepo.findByCarparkAndDate(carpark, date);
	}

	@Override
	public String[] buildTime() {
		
		String timeline[] = new String[24];
		
		for ( int i =0; i<timeline.length; i++) {
			timeline[i] = i + ":00";
		}
		return timeline;
		
	}

	@Override
	public List<Integer> getAvailablelots(List<Carpark> carparks) {
		int totalLots = 600;
		for (int i =0; i<24; i++) {
		int avaLots =	carparks.stream().filter(x->x.getDatetime().getHour() == 0)
				.mapToInt(x->x.getAvailableLots()).findFirst().getAsInt();
		System.out.println(avaLots);
		}
		return null;
	}
}
