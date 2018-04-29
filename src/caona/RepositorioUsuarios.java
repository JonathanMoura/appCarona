package caona;

import java.util.ArrayList;
import java.util.List;

public class RepositorioUsuarios implements IRepositorioUsuarios {
	List<UsuarioAbstrato> usuarios = new ArrayList<UsuarioAbstrato>();

	@Override
	public void adicionarUsuario(UsuarioAbstrato usuario) {
		usuarios.add(usuario);
	}

	@Override
	public void removerUsuario(int id) {
		for (int i = 0; i < usuarios.size(); i++) {
			if (usuarios.get(i).getId() == id) {
				usuarios.remove(i);
				break;
			}
		}
	}

	@Override
	public UsuarioAbstrato getUsuario(int id) {
		for (int i = 0; i < usuarios.size(); i++) {
			if (usuarios.get(i).getId() == id) {
				return usuarios.get(i);
			}
		}
		return null;
	}

	@Override
	public boolean existe(UsuarioAbstrato usuario) {
		if (usuarios.contains(usuario)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void atualizar(UsuarioAbstrato usuario) {
		for (int i = 0; i < usuarios.size(); i++) {
			if (usuarios.get(i).getId() == usuario.getId()) {
				usuarios.remove(i);
				usuarios.add(usuario);
				break;
			}
		}
	}

}
