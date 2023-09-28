package Construtor;

public class ObjetosTema {

	public static void main(String[] args) {
		Tema tema1 = new Tema();
		Tema tema2 = new Tema();
		
		tema1.setId(124);
		tema1.setNome("João");
		tema1.setValorAluguel(1000.00);
		tema1.setCorToalha("Preto claro");
		
		tema2.setId(124);
		tema2.setNome("Laerte");
		tema2.setValorAluguel(25000.00);
		tema2.setCorToalha("Branco escuro");
		
		System.out.println("-----TEMA 1-----");
		System.out.println(tema1.getId());
		System.out.println(tema1.getNome());
		System.out.println(tema1.getValorAluguel());
		System.out.println(tema1.getCorToalha());
		
		System.out.println("-----TEMA 2-----");
		System.out.println(tema2.getId());
		System.out.println(tema2.getNome());
		System.out.println(tema2.getValorAluguel());
		System.out.println(tema2.getCorToalha());
	}
}