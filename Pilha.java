public class Pilha{
    //criando atributos da Pilha
    private int size[];
    private int amount;

    //construtor
    public Pilha(){
        this.size = new int[5];
        this.amount = -1;
    }
    
    //getters
    public int getAmount(){
        return this.amount;
    }
    
    //metodos p/ verificar se a pilha esta cheia ou vazia
    public boolean isEmpty(){
        return this.getAmount() == -1;
    }
    public boolean isFull(){
        return this.getAmount() == this.size.length;
    }
    
    //metodo para adicionar um elemento
    public void push(int value){
        if(this.isFull()){
            System.out.println("Pilha cheia!");
        }else{
            this.size[++this.amount] = value;
        }
    }
    
    //metodo para remover um elemento
    public void pop(){
        if(this.isEmpty()){
            System.out.println("Pilha vazia!");
        }else{
            this.amount--;
        }
    }
    
    //metodo para alterar o elemento do topo
    public void pull(int value){
        if(value<1 || value>this.getAmount()+1){
            System.out.println("Erro!");
        }else{
            int temp = this.size[this.getAmount()];
            this.size[this.getAmount()] = this.size[value-1];
            this.size[value-1] = temp;
        }
    }
    
    //metodo para buscar o elemento no topo da pilha
    public void top(){
        if(this.isEmpty()){
            System.out.println("Pilha vazia!");
        }else{
            System.out.println("O elemento do topo é: " + this.size[this.getAmount()]);
        }
    }
    
    //metodo para exibir os elementos da pilha
    public void display(){
        if(this.isEmpty()){
            System.out.println("Pilha vazia!");
        }else{
            System.out.println("Quantidade de elementos: " + (this.getAmount()+1));
            for(int cont=0; cont<=this.getAmount(); cont++){
                System.out.print(this.size[cont] + " ");
            }
            System.out.println("");
        }
    }                
}