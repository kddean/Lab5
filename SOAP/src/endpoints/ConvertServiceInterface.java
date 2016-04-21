package endpoints;

import javax.jws.WebMethod;

public interface ConvertServiceInterface {
	@WebMethod
	public double inches(int a, String u, String u2);
	
	@WebMethod
	public double inToCm(int a, String u, String u2);
	
	@WebMethod
	public double days(int a, String u, String u2);
	
	@WebMethod
	public double feetToMiles(int a, String u, String u2);
	
	@WebMethod
	public double milesToKm(int a, String u, String u2);
	
	@WebMethod 
	public double weeksToYears(int a, String u, String u2);
}
