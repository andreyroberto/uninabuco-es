public class TestFila{ 
   public static void main(String args[]){ 

       Fila fila1 = new Fila();
       
       fila1.enqueue(7);
       fila1.enqueue(69);
       fila1.enqueue(92);
       fila1.enqueue(58);
       fila1.print();
       fila1.dequeue();
       fila1.dequeue();
       fila1.enqueue(26);
       fila1.print();
   }
}
