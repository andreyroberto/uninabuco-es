package listas;

public class Fila{
    //atributos
    private NoLista first;
    private NoLista last;
    private int amount;
   
    //construtor
    public Fila(){
        this.amount = 0;
    }

    //fila vazia
    public boolean isEmpty(){
        return this.amount == 0;
    }

    //gets e sets
    public NoLista getFirst(){
        return this.first;
    }
    private void setFirst(NoLista first){
        this.first = first;
    }
    public NoLista getLast(){
        return this.last;
    }
    private void setLast(NoLista last){
        this.last = last;
    }
    public int getAmount(){
        return this.amount;
    }
    private void setAmount(int amount){
        this.amount = amount;
    }

    //adicionar no
    public void enqueue(int valor){
        NoLista no = new NoLista(valor);
       
        if(!this.isEmpty()){
            this.last.setNext(no);
            this.last = no;
        }else{
            this.first = no;
            this.last = no;
        }
        this.amount++;
    }

    //remover no
    public void dequeue(){
        if(!this.isEmpty()){
            this.first = this.first.getNext();
        }
        this.amount--;
    }

    //printar fila
    public void print(){
        NoLista current = this.first;
       
        if(!this.isEmpty()){
            do{
                System.out.print(current.getValor() + " ");
                current = current.getNext();
            }while(current != null);
            System.out.println("");
        }
    }
}
