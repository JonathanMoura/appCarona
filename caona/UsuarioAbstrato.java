package caona;

public abstract class UsuarioAbstrato {
	private static int contadorId = 0;
	private int id;
	private String nome;
	private String nascimento;
	private String email;
	private String senha;
	private String telefone;

	public UsuarioAbstrato(String nome, String nascimento, String email, String senha, String telefone) {
		this.setId(contadorId++);
		this.setNome(nome);
		this.setNascimento(nascimento);
		this.setEmail(email);
		this.setSenha(senha);
		this.setTelefone(telefone);
	}

	public void mudarNome(String nome) {
		this.setNome(nome);
	}

	public void mudarTelefone(String telefone) {
		this.setTelefone(telefone);
	}

	public void mudarSenha(String senha) {
		this.setSenha(senha);
	}

	// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
