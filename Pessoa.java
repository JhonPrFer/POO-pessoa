
public class Pessoa {
	
	private String nome;
	private String datanasc;
	private double altura;
	
	public void SetNome(String nome) {
		this.nome = nome;
	}
	
	public String GetNome() {
		return this.nome;
	}
	
	public void SetDataNascimento(String data) {
		
		this.datanasc = data;
		
	}
	
	public String GetDataNascimento() {
		return this.datanasc;
	}

	public void SetAltura(double altura) {
		this.altura = altura;
	}
	
	public double GetAltura() {
		return this.altura;
	}
	
	public void GetDados() {
		System.out.println(GetNome()+" "+GetDataNascimento()+" "+GetAltura()+"m");
	}
	
	public int CalculaIdade(int ano) {
		return 2021- ano;
	}
}
