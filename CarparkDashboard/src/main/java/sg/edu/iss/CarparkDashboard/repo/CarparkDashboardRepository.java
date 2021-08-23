package sg.edu.iss.CarparkDashboard.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.edu.iss.CarparkDashboard.model.Carpark;


public interface CarparkDashboardRepository extends JpaRepository<Carpark, Integer> {
	
	@Query("Select c from Carpark c WHERE c.Address =:carpark AND c.datetime= :date ")
	List<Carpark> findByCarparkAndDate(@Param("carpark") Carpark carpark, @Param("date") LocalDate date);
}
