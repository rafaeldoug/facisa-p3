package entidades;

public class Pessoa {

	private String nome;
	private String email;
	private int idade;
	private Gender sexo;

	/**
	 * @param nome
	 * @param email
	 * @param idade
	 * @param sexo
	 */
	public Pessoa(String nome, String email, int idade, Gender sexo) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.sexo = sexo;
	}

	/**
	 * Obtem a variavel nome
	 *
	 * @return a variavel nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Ajusta a varialvel nome
	 *
	 * @param nome ajusta a variavel nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Obtem a variavel email
	 *
	 * @return a variavel email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Ajusta a varialvel email
	 *
	 * @param email ajusta a variavel email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Obtem a variavel idade
	 *
	 * @return a variavel idade
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * Ajusta a varialvel idade
	 *
	 * @param idade ajusta a variavel idade
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}

	/**
	 * Obtem a variavel sexo
	 *
	 * @return a variavel sexo
	 */
	public Gender getSexo() {
		return sexo;
	}

	/**
	 * Ajusta a varialvel sexo
	 *
	 * @param sexo ajusta a variavel sexo
	 */
	public void setSexo(Gender sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Pessoa: \n"
				+ "Nome = " + nome 
				+ "\nemail = " + email 
				+ "\nidade = " + idade 
				+ "\nsexo = " + sexo + "\n" ;
	}
	
	

}
