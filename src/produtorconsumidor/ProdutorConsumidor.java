package produtorconsumidor;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 *
 * @author Erick
 */
public class ProdutorConsumidor {

    public static void main(String[] args) {
        BlockingQueue<Pedido> pedidos = new ArrayBlockingQueue<Pedido>(100);
        
        Random ran = new Random();
        int num_mesas = ran.nextInt(10);
        Mesa m1 = new Mesa(1,pedidos);
        Mesa m2 = new Mesa(2,pedidos);
        Mesa m3 = new Mesa(3,pedidos);
        Mesa m4 = new Mesa(4,pedidos);
        Mesa m5 = new Mesa(5,pedidos);
        
        Cozinha c1 = new Cozinha(pedidos);
        Cozinha c2 = new Cozinha(pedidos);
        
        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();
        
        c1.start();
        c2.start();
    }
    
}
