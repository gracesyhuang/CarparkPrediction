package sg.edu.iss.carparkPrediction.model;


import java.time.LocalDate;
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
    private LocalDate Date;
    private String Time;
    
    
	public Carpark() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Carpark(int id, String area, String address, String lLCoord, int availableLots, LocalDate date,
			String time) {
		super();
		Id = id;
		Area = area;
		Address = address;
		LLCoord = lLCoord;
		AvailableLots = availableLots;
		Date = date;
		Time = time;
	}



	public Carpark(String area, String address, int availableLots, LocalDate date, String time) {
		super();
		Area = area;
		Address = address;
		AvailableLots = availableLots;
		Date = date;
		Time = time;
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


	public LocalDate getDate() {
		return Date;
	}


	public void setDate(LocalDate date) {
		Date = date;
	}


	public String getTime() {
		return Time;
	}


	public void setTime(String time) {
		Time = time;
	}


}

