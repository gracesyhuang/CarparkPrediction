package sg.edu.iss.CarparkDashboard.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//address is carparkName

@Entity
public class Carpark {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Area ;
    private String Address ;
    private String LLCoord ;
    private int AvailableLots;
    private LocalDateTime datetime;
    
    
	public Carpark() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Carpark(String address) {
		super();
		Address = address;
	}


	public Carpark(String area, String address, String lLCoord, int availableLots) {
		super();
		Area = area;
		Address = address;
		LLCoord = lLCoord;
		AvailableLots = availableLots;
	}

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getLLCoord() {
		return LLCoord;
	}
	public void setLLCoord(String lLCoord) {
		LLCoord = lLCoord;
	}
	public int getAvailableLots() {
		return AvailableLots;
	}
	public void setAvailableLots(int availableLots) {
		AvailableLots = availableLots;
	}

	public LocalDateTime getDatetime() {
		return datetime;
	}

	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}
}
