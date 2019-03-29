package listas;

public class Lista {
    //atributos
    private NoLista head;
    private NoLista tail;
    private int amount;
	
    //construtor
    public Lista(){
        this.head = null;
        this.tail = null;
        this.amount = 0;
    }

    //verifica se a lista está vazia
    public boolean estaVazia() {
        return this.tail == null;
    }
	
    //getters e settters
    public NoLista getHead(){
        return this.head;
    }
    private void setHead(NoLista head){
        this.head = head;
    }
    public NoLista getTail(){
        return this.tail;
    }
    private void setTail(NoLista tail){
        this.tail = tail;
    }
    public int getAmount(){
        return this.amount;
    }
	
    public void adicionar(int valor){
        NoLista no = new NoLista(valor);

        if (!this.estaVazia()) {
            this.tail.setNext(no);
            this.tail = no;
        }else {
            this.head = no;
            this.tail = no;
        }
        this.amount++;
    }
	
    //adicionar em posição especifica
    public void adicionarPosicao(int valor, int posicao){
        NoLista current = this.head;
        NoLista no = new NoLista(valor);
	    
        //verifica se a posição é valida
        if(!this.estaVazia() && posicao>0 && posicao<=this.getAmount()){
            //se for a primeira posicao
            if(posicao == 1){
                this.setHead(no);
                no.setNext(current);
            //se for a ultima posicao
            }else if(posicao == this.getAmount()){
                //for para encontrar o penultimo no
                for(; current.getNext() != this.tail;){
                    current = current.getNext();
                }
                no.setNext(current.getNext());
                current.setNext(no);
            //se tiver no meio da lista
            }else{
                for(int i=1; i<=posicao; i++){
                    if(posicao-1 == i){
                        no.setNext(current.getNext());
                        current.setNext(no);
                    }else{
                        current = current.getNext();
                    }
                }
            }
            this.amount++;
        }
    }
	
    //printar lista
    public void print(){
        NoLista current = this.head;
	    
        if(!this.estaVazia()){
            do{
                System.out.print(current.getValor() + " ");
                current = current.getNext();
            }while(current != null);
            System.out.println("");
        }
    }
	
}
