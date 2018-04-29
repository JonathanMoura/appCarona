package caona;

public class Fachada {

	private CadastroUsuarios usuarios;
	private Carona caronas;
	
	private static Fachada instance;

	public Fachada() {
		IRepositorioUsuarios repositorioUsuarios = new RepositorioUsuarios();
		usuarios = new CadastroUsuarios(repositorioUsuarios);
	}

	public static Fachada getInstance() {
		if (Fachada.instance == null) {
			Fachada.instance = new Fachada();
		}
		return Fachada.instance;
	}

	public void inserir(UsuarioAbstrato usuario) {
		this.usuarios.cadastrar(usuario);
	}

	public UsuarioAbstrato procurar(int id) {
		return this.usuarios.procurar(id);
	}

	public void remover(int id) {
		this.usuarios.remover(id);
	}
}

