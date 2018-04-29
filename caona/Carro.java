package caona;

public class Carro {
	String modelo;
	String cor;
	String placa;
	public Carro(String modelo, String cor, String placa)
	{
		this.setModelo(modelo);
		this.setCor(cor);
		this.setPlaca(placa);
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
			
}
