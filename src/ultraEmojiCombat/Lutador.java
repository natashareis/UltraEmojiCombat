package ultraEmojiCombat;

public class Lutador {
	//atributos
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	//métodos públicos
	public void apresentar(){
		System.out.println("It's time! Apresentamos o lutador " + this.getNome() +
				" Diretamente de " +this.getNacionalidade() + " com " + this.getIdade()+ " anos e " + this.getAltura()
				+ " pesando " + this.getPeso() + " kg " +", com " +this.getVitorias() +" vitórias e "+this.getDerrotas() +
				" derrotas e " + this.getEmpates()+ " empates!");
		
	}
	public void status(){
		System.out.println(this.getNome() + " é um peso "+this.getCategoria());
		System.out.println("ganhou "+this.getVitorias() + " lutas");
		System.out.println("perdeu "+this.getDerrotas() + " lutas");
		System.out.println("empatou "+this.getEmpates() + " lutas");
		
	}
	public void ganharLuta(){
		this.setVitorias(this.getVitorias()+1);
		
	}
	public void perderLuta(){
		this.setDerrotas(this.getDerrotas()+1);
	}
	public void empatarLuta(){
		this.setEmpates(this.getEmpates()+1);		
	}
	
	//métodos especiais

	

	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas,
			int empates) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if(this.peso<52.2){
			this.categoria="Invalido";
		}else if(this.peso<=70.3){
			this.categoria="Leve";
		}else if(this.peso<=83.9){
			this.categoria="Médio";
		}else if(this.peso<=120.2){
			this.categoria="Pesado";
		}else{
			this.categoria="Invalido";
		}
	}
	
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
		
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	
	

}
