package sg.edu.iss.carparkPrediction.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.edu.iss.carparkPrediction.model.Carpark;

public interface carparkPredictionRepository extends JpaRepository<Carpark, Integer> {
	
//	@Query("Select c from Carpark c WHERE c.Address =:carpark AND c.Date= :date ")
//	List<Carpark> findByCarparkAndDate(@Param("carpark") Carpark carpark, @Param("date") LocalDate date);
	
	@Query(value = "Select c from Carpark c WHERE c.Address =:address AND c.Date= :date ")
	List<Carpark> findCarparkByAddressAndDate(@Param("address") String address, @Param("date") LocalDate date);

//	public List<Carpark> findCarparkByAddressAndDate(String address, LocalDate date); 
}
