public class Teste{ 
    //metodo main
    public static void main(String args[]){
        //instanciando um objeto tipo Fila
        Fila f1 = new Fila();
        System.out.println("Fila está vazia? " + f1.isEmpty());
        f1.display();
        f1.add(2);
        f1.add(3);
        f1.add(4);
        f1.add(5);
        f1.add(6);
        f1.add(7);
        f1.display();
        f1.remove();
        f1.remove();
        f1.add(7);
        f1.add(8);
        f1.display();        
        f1.searchItem(1);
        System.out.println("Fila está cheia? " + f1.isFull());
    }
}