public class Elevador{
  private int andar_atual;
  private int total_andar;
  private int capacidade;
  private int quantidade;
  private int inicializado;

  public Elevador(){
    this.inicializado = 0;
  }

  public int getAndar_atual(){
    return this.andar_atual;
  }
  public void setAndar_atual(int andar){
    if(this.inicializado != 0){
      this.andar_atual = andar;
    }
  }
  public int getTotal_andar(){
    return this.total_andar;
  }
  public void setTotal_andar(int total){
    if(this.inicializado != 0){
      this.total_andar = total;
    }
  }
  public int getCapacidade(){
    return this.capacidade;
  }
  public void setCapacidade(int capacidade){
    if(this.inicializado != 0){
      this.capacidade = capacidade;
    }
  }
  public int getQuantidade(){
    return this.quantidade;
  }
  public void setQuantidade(int quantidade){
    if(this.inicializado != 0){
      this.quantidade = quantidade;
    }
  }

  public void inicializa(int capacidade, int total){
    if(this.inicializado == 0){
      this.capacidade = capacidade;
      this.total_andar = total;
      this.andar_atual = 0;
      this.quantidade = 0;
      this.inicializado = 1;
    }
  }

  public void sobe(){
    if(this.andar_atual < this.total_andar){
      this.andar_atual += 1;
    }
  }
  public void desce(){
    if(this.andar_atual > 0){
      this.andar_atual -= 1;
    }
  }
  public void entra(){
    if(this.getQuantidade() < this.getCapacidade()){
      this.setQuantidade(this.getQuantidade()+1);
    }
  }
  public void sai(){
    if(this.quantidade > 0){
      this.quantidade--;
    }
  }

}
