package Construtor;

public class ObjetosItemTema {

	public static void main(String[] args) {
		ItemTema itemtema1 = new ItemTema();
		ItemTema itemtema2 = new ItemTema();
		
		itemtema1.setId(124);
		itemtema1.setNome("João");
		itemtema1.setDescricao("Vivo");
		
		itemtema2.setId(124);
		itemtema2.setNome("Laerte");
		itemtema2.setDescricao("Claro");
		
		System.out.println("-----ITEM TEMA 1-----");
		System.out.println(itemtema1.getId());
		System.out.println(itemtema1.getNome());
		System.out.println(itemtema1.getDescricao());
		
		System.out.println("-----ITEM TEMA 2-----");
		System.out.println(itemtema2.getId());
		System.out.println(itemtema2.getNome());
		System.out.println(itemtema2.getDescricao());
	}
}