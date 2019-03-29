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
	
    //remover
    public void remove(int valor){
        NoLista current = this.head;

        if(!this.estaVazia()){
            do{
                if(current.getValor() == valor){
                    break;
                }else{
                    current = current.getNext();
                }
            }while(current != null);

            	//se o valor a ser removido estiver na lista
            if(current != null){
                //se a lista so tiver um elemento
                if(current == this.tail && current == this.head){
                    this.head = this.tail = null;
                //se o elemento for o primeiro
                }else if(current == this.head){
                    this.head = this.head.getNext();
                //se o elemento for o ultimo
                }else if(current == this.tail){
                    current = this.head;
                    for(; current.getNext() != this.tail;){
                        current = current.getNext();
                    }
                    current.setNext(null);
                    this.setTail(current);
                //se o elemento tiver no meio da lista
                }else{
                    NoLista temp = head;

                    for(; temp.getNext() != current;){
                        temp = temp.getNext();
                    }
                    temp.setNext(current.getNext());
                }
                this.amount--;
            }
        }
    }

    //remover no em posição especifica
    public void removePosicao(int posicao){
        NoLista current = this.head;

        //verifica se posicao existe
        if(!this.estaVazia() && posicao>0 && posicao<=this.getAmount()){
            if(posicao == 1){
                this.head = current.getNext();
                current.setNext(null);
            }else if(posicao == this.getAmount()){
                for(; current.getNext() != this.tail;){
                    current = current.getNext();
                }
                this.tail = current;
                current.setNext(null);
            }else{
                for(int i=1; i<=posicao; i++){
                    if(posicao-1 == i){
                        current.setNext(current.getNext().getNext());
                    }else{
                        current = current.getNext();
                    }
                }
            }
            this.amount--;
        }
    }

    //remover todas as ocorrencias de um no
    public void removeAll(int valor){
        NoLista current = this.head;
        int temp = this.getAmount();

        if(!this.estaVazia()){
            for(int i=1; i<=temp; i++){
                if(current.getValor() == valor){
                    this.remove(valor);
                }else{
                    current = current.getNext();
                }
            }
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
