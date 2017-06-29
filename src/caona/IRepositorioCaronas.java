package caona;

import java.util.List;

public interface IRepositorioCaronas {

	List<Carona> listarCaronas();

	void adicionarCarona(Carona carona);

	void removerCarona(int id);
	
	public void atualizarCarona(Carona carona);

	List<Carona> pesquisarPorData(String data);

	public void ordenarPorData();

	void ordenarPorDestino();
}
