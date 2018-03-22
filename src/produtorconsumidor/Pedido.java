package produtorconsumidor;

import java.util.Random;

/**
 *
 * @author Erick
 */
public class Pedido {
    int numero;
    String descricao;
    static int count = 0;
    static Random ran = new Random();
    
    public Pedido(){
        String opcoes[] = {"opção 1","opção 2","opção 3","opção 4","opção 5"};
        numero = ++count;
        descricao = opcoes[ran.nextInt(opcoes.length)];
    }
}
