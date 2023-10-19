package Heranca;

public class Principal2 {

	public static void main(String[] args) {
		
		Produto produto = new Produto (1,"Óculos", "650.00");
		System.out.println("Produto: ");
		System.out.println("Nome: " + produto.getNome());
		System.out.println("Preco: "+ produto.getPreco());
		
		Sorvete sorvete = new Sorvete (2,"Napolitano","25.0",14.5);
		System.out.println("Temperatura Adequada: "+ sorvete.getTempAdequada());
		
		Camisa camisa = new Camisa (3,"Gola alta","120.0","Branca","Algodão","M");
		System.out.println("Cor: " + camisa.getCor());
		System.out.println("Tecido: " + camisa.getTecido());
		System.out.println("Tamanho: "+ camisa.getTamanho());
		
	}

}