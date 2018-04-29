package caona;

import java.util.ArrayList;
import java.util.List;

public class RepositorioCaronas implements IRepositorioCaronas {
	public List<Carona> caronas;

	public RepositorioCaronas() {
		caronas = new ArrayList<Carona>();
	}

	@Override
	public List<Carona> listarCaronas() {
		ordenarPorData();
		return caronas;
	}

	@Override
	public void adicionarCarona(Carona carona) {
		caronas.add(carona);
	}

	@Override
	public void removerCarona(int id) {
		for (int i = 0; i < caronas.size(); i++) {
			if (caronas.get(i).getId() == id) {
				caronas.remove(i);
				break;
			}
		}
	}

	@Override
	public void atualizarCarona(Carona carona) {
		for (int i = 0; i < caronas.size(); i++) {
			if (caronas.get(i).getId() == carona.getId()) {
				caronas.remove(i);
				caronas.add(carona);
				break;
			}
		}
	}

	@Override
	public List<Carona> pesquisarPorData(String data) {
		List<Carona> listaCaronas = new ArrayList<Carona>();

		if (!caronas.contains(data)) {
			System.out.println("Não existe nenhuma carona nessa data");
		} else {
			for (int i = 0; i < caronas.size(); i++) {
				if (caronas.get(i).getData() == data) {
					listaCaronas.add(caronas.get(i));
				}
			}
		}

		return listaCaronas;
	}

	@Override
	public void ordenarPorData() { // melhorar precisão fazer a ordenação
									// primeiro mês e depois dia
		Carona aux;
		Carona c2;
		Carona c1;
		for (int i = 0; i < caronas.size(); i++) {
			c1 = caronas.get(i);
			for (int j = i + 1; j < caronas.size(); j++) {
				c2 = caronas.get(j);
				if (c1.getData().compareTo(c2.getData()) < 0) {
					aux = c1;
					c1 = c2;
					c2 = aux;
				}
			}
		}
	}

	@Override
	public void ordenarPorDestino() {
		Carona aux;
		Carona c2;
		Carona c1;
		for (int i = 0; i < caronas.size(); i++) {
			c1 = caronas.get(i);
			for (int j = i + 1; j < caronas.size(); j++) {
				c2 = caronas.get(j);
				if (c1.getDestino().compareTo(c2.getDestino()) < 0) {
					aux = c1;
					c1 = c2;
					c2 = aux;
				}
			}
		}
	}
}
