package codigo;

public interface Carro {
	public void setCor(String cor);
	public String getCor();
	public void setModelo(String modelo);
	public String getModelo();
	public void setValor(double valor);
	public double getValor();
	public void setDesconto(double desconto);
	public double getDesconto();
	public String toString();
	public double getValorFinal();
}
