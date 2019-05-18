package Buscador;

public class Train {

	private double price;
	private double time;
	public Train(String cityFrom, String cityTo, int numPass, String pathTrainDB, String cityListPath) {
		DataExt dato = new DataExt(cityListPath);
		try {
			boolean found1 = false;
			boolean found2 = false;
			for(int i=0; i< dato.getLine()&& (!found1||!found2);i++) {
				
				
			}
			this.hotelName= dato.hotelByInt(posit);
			this.price= dato.numByInt(posit)*nights*rooms;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
