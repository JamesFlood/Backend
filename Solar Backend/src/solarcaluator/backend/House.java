package solarcaluator.backend;

public class House {

	private String City = "";
	private String Country = "";
	
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

}
