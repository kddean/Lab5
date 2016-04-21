package endpoints;

import javax.jws.WebService;

@WebService(endpointInterface = "endpoints.ConvertServiceInterface")
public class ConvertService implements ConvertServiceInterface{
	@Override
	public double inches(int a, String u, String u2) {
		//Inches to Feet: 12in to 1ft
		
		double con = 0;
		con = a/12;
		return con;
	}

	
	public double feet(int a, String u, String u2){
		// Feet to Inches
		double con = 0;
		con = a*12;
		return con;
	}
	@Override
	public double inToCm(int a, String u, String u2) {
		// Inches to Centimeters" 1in to 2.54cm
		
		double con = 0;
		con = a*2.54;
		return con;
	}
	
	public double cmToIn(int a, String u, String u2){
		double con = 0;
		con = a/2.54;
		return con;
	}

	@Override
	public double days(int a, String u, String u2) {
		// Days to Months: 30.41 days to 1 month
		
		double con=0;
		con = a/30.41;
		return con;
	}
	
	public double months(int a){
		// Months to Days
		double con=0;
		con = a*30.41;
		return con;
	}

	@Override
	public double feetToMiles(int a, String u, String u2) {
		// Feet to Miles: 5280ft to 1mi
		
		double con=0;
		con = a/5280;
		return con;
	}
	
	public double milesToFeet(int a){
		// Miles to Feet
		double con=0;
		con = a*5280;
		return con;
	}

	@Override
	public double milesToKm(int a, String u, String u2) {
		// Miles to Kilometer: .62mi to 1km
		double con=0;
		con = a/.62;
		return con;
	}
	
	public double kmToMiles(int a){
		// Kilometer to Miles
		double con=0;
		con = a*.62;
		return con;
	}

	@Override
	public double weeksToYears(int a, String u, String u2) {
		// Weeks To Years: 52 weeks to 1 year
		
		double con =0;
		con = a/52;
		
		return con;
	}
	
	public double yearsToWeeks(int a){
		double con =0;
		con = a*53;
		return con;
	}

	public double ftToM(int a){
		// Feet to Meter: 3.28 to 1m
		double con=0;
		con = a/3.28;
		return con;
	}
	
	public double mToFt(int a){
		// Meters to Feet
		double con=0;
		con = a*3.28;
		return con;
	}
}
