package Construtor;

public class ObjetosEndereco {

	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		
		endereco.setId(124);
		endereco.setLogradouro("Rua zero");
		endereco.setNumero(333);
		endereco.setComplemento("Loja Hidroluz");
		endereco.setBairro("Santana");
		endereco.setCidade("Joinville");
		endereco.setCep("12308-764");
		endereco.setUf("São Paulo");
		
		System.out.println("-----ENDERECO 1-----");
		System.out.println(endereco.getId());
		System.out.println(endereco.getLogradouro());
		System.out.println(endereco.getNumero());
		System.out.println(endereco.getComplemento());
		System.out.println(endereco.getBairro());
		System.out.println(endereco.getCidade());
		System.out.println(endereco.getCep());
		System.out.println(endereco.getUf());
	}
}