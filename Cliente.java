
public class Cliente {

	private String cod;
	private String nome;
	private String cpf;
	private String endereco;

	
	public Cliente(String cod, String nome, String cpf, String endereco) {
		super();
		this.cod = cod;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Cliente [cod=" + cod + ", nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + "]";
	}
	
	

}
