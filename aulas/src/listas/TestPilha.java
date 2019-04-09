public class TestPilha{ 
    public static void main(String args[]){ 

        Pilha pilha1 = new Pilha();
        
        pilha1.push(13);
        pilha1.push(50);
        pilha1.push(33);
        pilha1.push(18);
        pilha1.print();
        pilha1.pop();
        pilha1.pop();
        pilha1.pull(71);
        pilha1.push(26);
        pilha1.print();
        pilha1.top();

    }
}
