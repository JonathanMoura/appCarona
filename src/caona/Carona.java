package caona;

public class Carona {
	private static int contadorId = 0;
	private int id;
	private String status;
	private String modo; // Define se é carona pedida ou oferecida
	private int motoristaId;
	private int passageiroId;
	private int vagas;
	private double preco;
	private String origem;
	private String destino;
	private String data;
	private String hora;

	public Carona(int motoristaId, int vagas, double preco, String origem, String destino, String data,
			String hora) {
		this.setId(contadorId++);
		this.setStatus("aberta");
		this.setModo("oferecida");
		this.setMotoristaId(motoristaId);
		this.setVagas(vagas);
		this.setPreco(preco);
		this.setOrigem(origem);
		this.setDestino(destino);
		this.setData(data);
		this.setHora(hora);
	}
	
	public Carona(int passageiroId, String origem, String destino, String data, String hora)
	{
		this.setId(contadorId++);
		this.setStatus("aberta");
		this.setModo("pedida");
		this.setPassageiroId(passageiroId);
		this.setOrigem(origem);
		this.setDestino(destino);
		this.setHora(hora);
		this.setData(data);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getModo() {
		return modo;
	}

	public void setModo(String modo) {
		this.modo = modo;
	}

	public int getMotoristaId() {
		return motoristaId;
	}

	public void setMotoristaId(int motoristaId) {
		this.motoristaId = motoristaId;
	}

	public int getPassageiroId() {
		return passageiroId;
	}

	public void setPassageiroId(int passageiroId) {
		this.passageiroId = passageiroId;
	}

	public int getVagas() {
		return vagas;
	}

	public void setVagas(int vagas) {
		this.vagas = vagas;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

}
