import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {
	Resultados res = new Resultados();
		
	public void leerArchivo(){
		String name = "prueba.asm";
		
		FileReader fr;
		try {
			fr = new FileReader(name);
			BufferedReader buf = new BufferedReader(fr);
			while(buf.ready()){
				res.textArea.append("\n"+buf.readLine());
			}
					
			res.setVisible(true);
			buf.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
		
	
	}
	
	public void escribirArchivo(){
		String name = "ejemplo.asm";

		
		try {
			FileWriter fw= new FileWriter(name);
			fw.write("\nProbando escritura");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
