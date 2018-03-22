package produtorconsumidor;

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
}
