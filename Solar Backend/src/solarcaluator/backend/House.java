package solarcaluator.backend;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonElement;

public class House {

	private String City = "";
	private String Country = "";
	private List<Roof> Roofs = new ArrayList<Roof>();
	
	public void setLocation(String City, String Country) {
		this.City=City;
		this.Country=Country;
	}

	public String getCity() {

		return City;
	}

	public String getCountry() {

		return Country;
	}
	
	public void setRoof(Roof RoofSection) {
		
		Roofs.add(RoofSection);
	}
	
	public Roof getRoof(int index){
		
		return Roofs.get(index);
	}
	
	public int numberOfRoofs(){
		
		return Roofs.size();
	}

}
