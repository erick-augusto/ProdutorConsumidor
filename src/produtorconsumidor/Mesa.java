package produtorconsumidor;

import java.util.concurrent.BlockingQueue;

/**
 *
 * @author Erick
 */
public class Mesa extends Thread {
    BlockingQueue<Pedido> fila;
    int numero;
    
}
