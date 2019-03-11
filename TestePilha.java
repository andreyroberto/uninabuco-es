public class TestePilha{ 
    //metodo main
    public static void main(String args[]){
        //instanciando um objeto tipo Pilha
        Pilha p1 = new Pilha();
        System.out.println("Pilha está vazia? " + p1.isEmpty());
        p1.display();
        p1.push(6);
        p1.push(7);
        p1.push(8);
        p1.push(9);
        p1.push(10);
        p1.display();
        p1.top();
        p1.pop();
        p1.pop();
        p1.display();
        p1.top();
        p1.push(11);
        p1.pull(2);
        p1.display();
        p1.top();
    }
}