package Construtor;

public class Aluguel {
	private long id;
	private String dataFesta;
	private String horarioInicio;
	private String horarioTermino;
	private double valorCobrado;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDataFesta() {
		return dataFesta;
	}
	public void setDataFesta(String dataFesta) {
		this.dataFesta = dataFesta;
	}
	public String getHorarioInicio() {
		return horarioInicio;
	}
	public void setHorarioInicio(String horarioInicio) {
		this.horarioInicio = horarioInicio;
	}
	public String getHorarioTermino() {
		return horarioTermino;
	}
	public void setHorarioTermino(String horarioTermino) {
		this.horarioTermino = horarioTermino;
	}
	public double getValorCobrado() {
		return valorCobrado;
	}
	public void setValorCobrado(double valorCobrado) {
		this.valorCobrado = valorCobrado;
	}
	
}