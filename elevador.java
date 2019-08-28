public class Elevador{
  private int andar_atual;
	private int total_andares;
	private int quantidade;
	private int capacidade;
	private boolean inicializado;

  //construtor
  public Elevador(){
    this.inicializado = false;
  }

  //getters
	public int getAndar_atual() {
		return andar_atual;
	}
	public int getTotal_andares() {
		return total_andares;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public boolean getInicializado() {
		return inicializado;
	}

  //metodos da classe
	public void inicializa(int capacidade, int totalAndares){
		if(this.inicializado == false){
			this.capacidade = capacidade;
			this.total_andares = totalAndares;
			this.andar_atual = 0; this.quantidade = 0; this.inicializado = true;
		}
	}
	
	public void sobe(){
		if(this.andar_atual < this.total_andares && this.inicializado == true){
			this.andar_atual += 1;
		}
	}
	public void desce(){
		if(this.andar_atual >= 1 && this.inicializado == true){
			this.andar_atual -= 1;
		}
	}
	public void entra(){
		if(this.quantidade < this.capacidade && this.inicializado == true){
			this.quantidade += 1;
		}
	}
	public void sai(){
		if(this.getQuantidade() > 0 && this.inicializado == true){
			this.quantidade -= 1;
		}
	}
	
	public void qualAndar(){
		int a = this.andar_atual;
		if(this.inicializado != false){
			if (a == 0)
				System.out.println("O elevador está no térreo.");
			else
				System.out.println("O elevador está no " + a + ". andar.");
		}
	}
	
	public void cabeMaisUm(){
		if(this.inicializado == true){
			if(this.quantidade == 0)
				System.out.println("O elevador está vazio.");
			else if(this.quantidade == 1)
				System.out.print("Tem " + this.getQuantidade() + " pessoa no elevador. ");
			else
				System.out.print("Tem " + this.getQuantidade() + " pessoas no elevador. ");
			
			if(this.quantidade > 0 && this.quantidade < this.capacidade){
				System.out.println( "Ainda podem entrar " + (this.capacidade - this.quantidade) + " pessoas.");
			}
		}
	}
	
	public void chamarElevador(int andar){
		if(andar != this.andar_atual && andar > 0 && andar <= this.total_andares){
			if(andar < this.andar_atual){
				System.out.println("Descendo...");
				for(int i=this.andar_atual; i >= andar; i--){
					System.out.println(i + "...");
				}
			}else{
				System.out.println("Subindo...");
				for(int i=this.andar_atual; i <= andar; i++){
					System.out.println(i + "...");
				}
			}
			this.andar_atual = andar;
		}
	}
}
