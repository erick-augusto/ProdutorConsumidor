package produtorconsumidor;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

/**
 *
 * @author Erick
 */
public class Cozinha extends Thread {
    BlockingQueue<Pedido> fila;
    
    public Cozinha(BlockingQueue<Pedido> fila){
        this.fila = fila;
    }
    
    @Override
    public void run(){
        Random ran = new Random();
        for(int i = 0; i < 5000; i++){
            
        }
    }
}
