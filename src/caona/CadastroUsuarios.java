package caona;

public class CadastroUsuarios {

	private IRepositorioUsuarios usuarios;

	public CadastroUsuarios(IRepositorioUsuarios repositorio) {
		this.usuarios = repositorio;
	}

	public void cadastrar(UsuarioAbstrato usuario) {
		if (usuario != null) {
			if (!(usuarios.existe(usuario))) {
				usuarios.adicionarUsuario(usuario);
			} else {
				System.out.println("Usuário já existente");
			}
		} else {
			System.out.println("Conta inválida");
		}
	}

	public UsuarioAbstrato procurar(int id) {
		return this.usuarios.getUsuario(id);
	}

	public void remover(int id) {
		this.usuarios.removerUsuario(id);
	}

	public void atualizar(UsuarioAbstrato usuario) {
		this.usuarios.atualizar(usuario);
	}

}