package produtorconsumidor;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

/**
 *
 * @author Erick
 */
public class Mesa extends Thread {
    BlockingQueue<Pedido> fila;
    int numero;
    
    public Mesa(int numero, BlockingQueue<Pedido> fila){
        this.numero = numero;
        this.fila = fila;
    }
    
    @Override
    public void run(){
        Random ran = new Random();
        for(int i = 0; i < 40; i++){
            Pedido p = new Pedido();
        }
    }
}
