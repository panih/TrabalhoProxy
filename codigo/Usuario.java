package codigo;

public class Usuario {
	private String nome;
	private String tipo;
	
	public Usuario(String nome, String tipo) {
		this.nome = nome;
		this.tipo = tipo; 
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setTipo(String tipo) {
		if (tipo.equals("gerente")) 
			this.tipo = tipo;
		else
			this.tipo = "vendedor";
	}
}
