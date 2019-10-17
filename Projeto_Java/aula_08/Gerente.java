package aula_08;

public class Gerente extends Funcionarios {

	private String login;
	private int senha;
	
	public Gerente() {
		super();

		this.login = null;
		this.senha = 0;
	}

	public Gerente(String nome, double salario, String login, int senha) {
		super(login, senha);

		this.login = login;
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public String imprimeDados() {

		String dados = super.imprimeDados() + "\nLogin:" + login + "\n Senha" + senha;
		return dados;

}
   
}	   
   
   
   
