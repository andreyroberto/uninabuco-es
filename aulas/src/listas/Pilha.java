package listas;

class Pilha{
    //atributos
    private NoLista top;
    private NoLista base;
    private int amount;
    
    //construtor
    public Pilha(){
        this.amount = 0;
    }
    
    //pilha vazia
    public boolean isEmpty(){
        return this.top == null;
    }
    
    //gets e sets
    public NoLista getTop(){
        return this.top;
    }
    private void setTop(NoLista top){
        this.top = top;
    }
    public NoLista getBase(){
        return this.base;
    }
    private void setBase(NoLista base){
        this.base = base;
    }
    public int getAmount(){
        return this.amount;
    }
    private void setAmount(int amount){
        this.amount = amount;
    }
    
    //adicionar
    public void push(int valor){
        NoLista no = new NoLista(valor);
        
        if(!this.isEmpty()){
            this.top.setNext(no);
            this.top = no;
        }else{
            this.top = no;
            this.base = no;
        }
        this.amount++;
    }
    
    //remover
    public void pop(){
        NoLista current = this.base;
        
        if(!this.isEmpty()){
            if(this.base != this.top){
                for(; current.getNext() != this.getTop(); ){
                    current = current.getNext();
                }
                current.setNext(null);
                this.setTop(current);
            }else{
                this.base = this.top = null;
            }
        }
        this.amount--;
    }
    
    //acessar o elemento do topo
    public void top(){
        if(!this.isEmpty()){
            System.out.println("Elemento do topo: " + this.getTop().getValor());
        }
    }
    
    //alterar elemento do top
    public void pull(int valor){
        
        if(!this.isEmpty()){
            this.top.setValor(valor);
        }
    }
    
    //printar pilha
    public void print(){
        NoLista current = this.base;
        
        if(!this.isEmpty()){
            do{
                System.out.print(current.getValor() + " ");
                current = current.getNext();
            }while(current != null);
        }
        System.out.println("");
    }
}
