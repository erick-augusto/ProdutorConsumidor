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
        int buscar = ran.nextInt(5000);
        for(int i = 0; i < buscar; i++){
            try{
                Pedido p = fila.take();
                Thread.sleep(ran.nextInt(2000));
                System.out.println("Pedido nº "+ p.numero + "(" + p.descricao + ") pronto!");
            } catch(InterruptedException ex){
                break;
            }
        }
    }
}
