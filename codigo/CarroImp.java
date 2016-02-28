package codigo;

public class CarroImp implements Carro {
	private String cor;
	private String modelo;
	private double valor;
	private double desconto;
	
	public CarroImp(String cor, String modelo, double valor, double desconto) {
		this.cor = cor;
		this.modelo = modelo;
		this.valor = valor;
		this.desconto = desconto;
	}
	@Override
	public String getCor() {
		return cor;
	}
	@Override
	public String getModelo() {
		return modelo;
	}
	@Override
	public double getDesconto() {
		return desconto;
	}
	@Override
	public double getValor() {
		return valor;
	}
	@Override
	public void setCor(String cor) {
		this.cor = cor;
	}
	@Override
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	@Override
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Modelo : " + this.modelo + "\n");
		sb.append("Cor : " + this.cor + "\n");
		sb.append("Valor : " + this.valor + "\n");
		sb.append("Desconto : " + this.desconto + "\n");
		sb.append("Valor Final: " + this.getValorFinal() + "\n");
		return sb.toString();
	}
	
	@Override
	public double getValorFinal() {
		return this.valor - (this.valor * this.desconto);
	}
}
