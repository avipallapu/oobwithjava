package oobwithjava;

import java.io.Serializable;

public class Airport implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7988262758854363676L;
	int airportId;
	String airportName;
	
	public int getAirportId() {
		return airportId;
	}
	public void setAirportId(int airportId) {
		this.airportId = airportId;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	
	
}
