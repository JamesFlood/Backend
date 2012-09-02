package solarcaluator.backend;



public class CalculatePower {

	//Average Daily Solar Generation = (System Size * 
	//Efficiency Loss from Roof, Age, Inverter) *  
	//Average Hours of Sunlight
	
	public static double calculate(double systemSize, double efficiency, int sunlight, int days){
		
		return ((systemSize * efficiency) * sunlight) * days;
	}
	
	public static double efficiency(int angle, String direction, int age){
		
		
		
		return 0.8;
	}
	
	
}
