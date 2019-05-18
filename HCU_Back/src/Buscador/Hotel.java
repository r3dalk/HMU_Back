package Buscador;
import org.json.*;



public class Hotel {
	private String hotelName;
	private double price;
	public Hotel(String city,int nights, int rooms, String path) {
		DataExt dato = new DataExt(path);
		try {
			int posit= dato.busca(city);
			this.hotelName= dato.hotelByInt(posit);
			this.price= dato.numByInt(posit)*nights*rooms;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
