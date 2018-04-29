package caona;

import java.util.ArrayList;
import java.util.List;

public class Motorista extends Passageiro {
	List<Carro> carros = new ArrayList<Carro>();

	public Motorista(String nome, String nascimento, String email, String senha, String telefone) {
		super(nome, nascimento, email, senha, telefone);
	}

	public void adicionarCarro(Carro carro) {
		carros.add(carro);
	}

	public boolean removerCarro(Carro carro) {
		if (carros.remove(carro)) {
			return true;
		} else {
			return false;
		}
	}
}
