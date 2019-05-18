package Buscador;

public class Train {

	private double price;
	private double time;
	public Train(String cityFrom, String cityTo, int numPass, String pathTrainDB) {
		DataExt dato = new DataExt(pathTrainDB);
		try {
			int posit= dato.busca(city);
			this.hotelName= dato.hotelByInt(posit);
			this.price= dato.numByInt(posit)*nights*rooms;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
