package Construtor;

public class ObjetosAluguel {

	public static void main(String[] args) {
		Aluguel aluguel = new Aluguel();
		
		aluguel.setId(124);
		aluguel.setDataFesta("03/02/23");
		aluguel.setHorarioInicio("15:00");
		aluguel.setHorarioTermino("00:00");
		aluguel.setValorCobrado(60.00);
		
		System.out.println("-----ALUGUEL-----");
		System.out.println(aluguel.getId());
		System.out.println(aluguel.getDataFesta());
		System.out.println(aluguel.getHorarioInicio());
		System.out.println(aluguel.getHorarioTermino());
		System.out.println(aluguel.getValorCobrado());
	}
}