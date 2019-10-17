
package aula_08;

public class TesteFunc {



	public static void main(String[] args) {
		Gerente g = new Gerente("ewtata", 1470.00, "abtrde", 15); 
		g.setNome("Batata");
		g.setSalarios(134500.00);
		g.setLogin("abcde");
		g.setSenha(145);
		
		/*System.out.println("Nome do Funcionario : " + g.getNome());
		System.out.println("Salario: " + g.getSalarios());
		System.out.println("Login: "  + g.getLogin());
		System.out.println("Salario: " + g.getSenha());*/
		
		
		System.out.println(g.imprimeDados());
		
		Secretaria s = new Secretaria("abestada", 1000.12, 112.233); 
		s.setNome("Maria");
		s.setSalarios(10340.00);
		s.setNumeroramal(112.233);
		
		/*System.out.println("Nome do Funcionario : " + s.getNome());
		System.out.println("Salario: " + s.getSalarios());
		System.out.println("Numero Ramal: " + s.getNumeroramal()); */
		
		System.out.println(g.imprimeDados());
		
		Telefonista t = new Telefonista("Batata", 1000.40, 789654); 
		t.setNome("Hill");
		t.setSalarios(10650.00);
		t.setCodigo(789654);
		
		/*System.out.println("Nome do Funcionario : " + t.getNome());
		System.out.println("Salario: " + t.getSalarios());
		System.out.println("Codigo: " + t.getCodigo());*/
		
		
		System.out.println(g.imprimeDados());

		
	}

}



