package Buscador;




public class Hotel {
	private String hotelName;
	private double price;
	public Hotel(String city,int nights, int rooms, String pathHotelDB) {
		DataExt dato = new DataExt(pathHotelDB);
		try {
			int posit= dato.busca(city,4);
			this.hotelName= dato.hotelByInt(posit);
			this.price= dato.numByInt(posit)*nights*rooms;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
