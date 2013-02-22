
public class Cerveza {
	private String marca;
	private float precio;
	private int ml;
	
	public Cerveza(String marca, float precio, int ml){
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

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getMl() {
		return ml;
	}

	public void setMl(int ml) {
		this.ml = ml;
	}
	
	
	
	
}
