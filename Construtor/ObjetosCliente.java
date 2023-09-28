package Construtor;

public class ObjetosCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		cliente.setId(124);
		cliente.setNome("João");
		cliente.setTelefone("21 99876-1234");
		cliente.setCpf("234.325.753-23");
		cliente.setRg("123562677722");
		
		System.out.println("-----CLIENTE-----");
		System.out.println(cliente.getId());
		System.out.println(cliente.getNome());
		System.out.println(cliente.getTelefone());
		System.out.println(cliente.getCpf());
		System.out.println(cliente.getRg());
	}
}