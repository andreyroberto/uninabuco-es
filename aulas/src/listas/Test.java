package listas;

public class Test {

    public static void main(String[] args) {
		
        Lista lista = new Lista();
	    
        System.out.print("Está vazia? ");
        System.out.println(lista.estaVazia() ? "Sim":"Não");
        lista.adicionar(67);
        System.out.println("Está vazia? " + lista.estaVazia());
        lista.adicionar(5);
        lista.adicionar(77);
        lista.adicionar(62);
        lista.adicionar(55);
        lista.adicionar(5);
        lista.adicionar(16);
        lista.print();
        lista.remove(77);
        lista.adicionarPosicao(10, 3);
        lista.removePosicao(2);
        lista.removeAll(5);
        lista.print();
    }

}
