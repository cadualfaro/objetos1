/*
Faça um construtor que recebe 2 carros, e inicializa o novo carro com os valores do mais caro
 */
package objetos1;

public class Objetos1 {

    public static void main(String[] args) {

        Carro c1 = new Carro("Volkswagen");
        Carro c2 = new Carro("Fusca", 1986);
        Carro c3 = new Carro(c1, c2);

    }

}
