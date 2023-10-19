package Heranca;

public class Sorvete extends Produto{

	private double tempAdequada;

	public Sorvete(long id, String nome, String preco, double tempAdequada) {
		super(id, nome, preco);
		this.tempAdequada = tempAdequada;
	}

	public double getTempAdequada() {
		return tempAdequada;
	}

	public void setTempAdequada(double tempAdequada) {
		this.tempAdequada = tempAdequada;
	}
	
}