package teste;
import codigo.*;

public class TesteProxyCarro {
	public static void main(String[] args) {
		CarroProxy carro = new CarroProxy();
		
		Usuario gerente = new Usuario("Mateus Oliveira", "gerente");
		Usuario vendedor = new Usuario("Francisco Xavier", "vendedor");
		
		// gerente 
		carro.autenticar(gerente);
		carro.criar("azul", "classic", 12000.00, 0.0);
		System.out.println(carro.toString());
		
		System.out.println("\n");
		
		// vendedor
		carro.autenticar(vendedor);
		carro.setDesconto(0.19);
		System.out.println(carro.toString());
		
		
		
	}
}
