package caona;

public interface IRepositorioUsuarios {
	public void adicionarUsuario(UsuarioAbstrato usuario);

	public void removerUsuario(int id);

	public UsuarioAbstrato getUsuario(int id);
	
	public boolean existe(UsuarioAbstrato usuario);
	
	public void atualizar(UsuarioAbstrato usuario);
}
