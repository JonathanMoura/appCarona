package caona;
//Hello World
public class CadastroCaronas {
	private IRepositorioCaronas caronas;

	public CadastroCaronas(IRepositorioCaronas repositorio) {
		this.caronas = repositorio;
	}

	public void adicionar(Carona carona) {
		if (carona != null) {
			caronas.adicionarCarona(carona);
		} else {
			System.out.println("Carona inválida");
		}
	}
	
	public void remover(int id)
	{
		caronas.removerCarona(id);
	}
	
	public void atualizar(Carona carona)
	{
		
	}
}
