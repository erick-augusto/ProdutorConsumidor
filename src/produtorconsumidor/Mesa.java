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
        int num_pedidos = ran.nextInt(50);
        for(int i = 0; i < num_pedidos; i++){
            Pedido p = new Pedido();
            try{
                fila.put(p);
                System.out.println("Novo pedido nº"+p.numero+" da mesa "+numero);
                Thread.sleep(ran.nextInt(1000));
            } catch(InterruptedException ex){
                break;
            }
        }
    }
}
