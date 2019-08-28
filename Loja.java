package grrrrrr;

public class Loja extends PessoaJuridica{
 public String Seguimento;

@Override
public String toString() {
	return "Loja [Seguimento=" + Seguimento + "]";
}

public Loja(String nome, int idade, String cNPJ, String seguimento) {
	super(nome, idade, cNPJ);
	Seguimento = seguimento;
}
 
}
