package Buscador;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class DataExt {
	private String ciudad;
	private String hotel;
	private double coste;
	private String ruta;
	private int lineas;
	
	public DataExt(String ruta) {
		this.ruta=ruta;
		File file =   new File(ruta); 
	    @SuppressWarnings("resource")
		Scanner sc;
		try {
			sc = new Scanner(file);
			int lines = 0;
			while (sc.nextLine() != null) lines++;
			sc.close();
			this.lineas=lines;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	    
	}
	
	public String read () throws Exception 
		  { 
		    // pass the path to the file as a parameter 
		    File file =   new File(ruta); 
		    @SuppressWarnings("resource")
			Scanner sc = new Scanner(file); 
		    String linea = sc.nextLine();
		    
		    return linea;
		  } 
	public int busca(String buscado, int add) throws Exception {
		
		boolean found = false;
		int num=0;
		Stream<String> lines = Files.lines(Paths.get(ruta));
				for(;num<this.lineas&&!found;num+=add) {
				
				if(lines.skip(num).findFirst().get().equals(buscado))
					found = true;
		}
		return num;
	}
		public String  hotelByInt(int num) throws IOException {
			try (Stream<String> lines = Files.lines(Paths.get(ruta))) {
			    String hotel = lines.skip(num).findFirst().get();
			    return hotel;
			}
		}
		public double  numByInt(int num) throws IOException {
			try (Stream<String> lines = Files.lines(Paths.get(ruta))) {
				String precio = lines.skip(num+1).findFirst().get();
				return Double.parseDouble(precio);
			}
		}
		public int getLine() {
			return this.lineas;
		}
	}

