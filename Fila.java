public class Fila{
    //criando atributos da Fila
    private int size[];
    private int first;
    private int last;
    private int amount;
   
    //construtor
    public Fila(){
        this.size = new int[5];
        this.first = 0;
        this.last = 0;
        this.amount = 0;
    }
   
    //getters
    public int getAmount(){
        return this.amount;
    }
   
    //metodos p/ verificar se a fila esta cheia ou vazia
    public boolean isEmpty(){
        return this.getAmount() == 0;
    }
    public boolean isFull(){
        return this.getAmount() == this.size.length;
    }
   
    //metodo para adicionar um elemento
    public void add(int value){
        if(this.isEmpty() == true){
            this.size[this.first] = value;
            this.last++;
            this.amount++;
        }else if(this.isFull() == true){
            System.out.println("Erro, Fila cheia!");            
        }else{
            this.size[this.last] = value;
            this.last++; this.amount++;
        }
    }
   
    //metodo para remover um elemento
    public void remove(){
        if(this.isEmpty() == true){
            System.out.println("Fila está vazia!");
        }else{
            this.last--; this.amount--;
            for(int c1=0, c2=1; c1<this.getAmount(); c1++, c2++){
                this.size[c1] = this.size[c2];
            }
        }
    }
   
    //metodo para buscar um unico elemento
    public void searchItem(int value){
        if(value<1 || value>this.size.length || value>this.getAmount()){
            System.out.println("Erro!");
        }else{
            System.out.println("O elemento " + value + ". da Fila é = " + this.size[value-1]);
        }
    }
   
    //metodo para exibir os elementos da fila
    public void display(){
        if(this.isEmpty() == true){
            System.out.println("Fila vazia!");
        }else{
            System.out.println("Quantidade de elementos: " + this.getAmount());
            for(int cont=0; cont<this.getAmount(); cont++){
                System.out.print(this.size[cont] + " ");
            }
            System.out.println("");
        }
    }             
}