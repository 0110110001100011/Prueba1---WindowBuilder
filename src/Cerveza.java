
public class Cerveza {
	public String marca;
	public double precio;
	public int ml;
	
	public Cerveza(String marca, double precio, int ml){
		super();
		this.setMarca(marca);
		this.setPrecio(precio);
		this.setMl(ml);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio2) {
		this.precio = precio2;
	}

	public int getMl() {
		return ml;
	}

	public void setMl(int ml) {
		this.ml = ml;
	}
	
	
	
	
}
