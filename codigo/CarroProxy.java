package codigo;

public class CarroProxy implements Carro {
	private Carro carro;
	private Usuario usuario = new Usuario("padrao", "padrao");
	
	public void autenticar(Usuario usuario) {
		this.usuario = usuario;
	}

	public void criar(String cor, String modelo, double valor, double desconto) {
		if (usuario.getTipo().equals("gerente")) 
			carro = new CarroImp(cor, modelo, valor, desconto);
		else 
			System.err.println("Acesso Negado!!!");
	}
	

	@Override
	public void setCor(String cor) {
		if (usuario.getTipo().equals("gerente"))
			carro.setCor(cor);
		else
			System.err.println("Acesso Negado!!!");
	}

	@Override
	public String getCor() {
		return carro.getCor();
	}

	@Override
	public void setModelo(String modelo) {
		if (usuario.getTipo().equals("gerente"))
			carro.setModelo(modelo);
		else
			System.err.println("Acesso Negado!!!");
	}

	@Override
	public String getModelo() {
		return carro.getModelo();
	}

	@Override
	public void setValor(double valor) {
		if (usuario.getTipo().equals("gerente"))
			carro.setValor(valor);
		else
			System.err.println("Acesso Negado!!!");

	}

	@Override
	public double getValor() {
		return carro.getValor();
	}

	@Override
	public void setDesconto(double desconto) {
		if (usuario.getTipo().equals("gerente"))
			carro.setDesconto(desconto);
		else if (usuario.getTipo().equals("vendedor") && desconto <= 0.20)
			carro.setDesconto(desconto);
		else
			System.err.println("Acesso Negado!!!");
	}

	@Override
	public double getDesconto() {
		return carro.getDesconto();
	}
	
	@Override
	public String toString() {
		return carro.toString();
	}
	
	@Override
	public double getValorFinal() {
		return carro.getValorFinal();
	}
}
