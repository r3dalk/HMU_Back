package Buscador;
import org.json.*;
import org.omg.CORBA.Request;

public class Country {
	private String pais;
	private String url;
	
	public Country(String pais) {
		
		
		this.pais=pais;
		this.url = url;
		
	}
	public String getUrl() {
		return this.url;
	}
}
