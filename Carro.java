
package objetos1;

public class Carro {
    
    double valor;
    String marca;
    int ano;

    
    public Carro(String a) {
        valor = 30.5;
        marca = a;
        ano = 1950;
        System.out.println("");
        System.out.println("Carro A");
        System.out.println("Marca: "+marca);
        System.out.println("Valor: "+valor);
        System.out.println("Ano: "+ano);
    }

    public Carro(String a, int b) {
        valor = 15.2;
        marca = a;
        ano = b;
        System.out.println("");
        System.out.println("Carro B");
        System.out.println("Marca: "+marca);
        System.out.println("Valor: "+valor);
        System.out.println("Ano: "+ano);
    }

    public Carro(Carro a, Carro b) {

        if (a.valor > b.valor) {
            marca = a.marca;
            valor = a.valor;
            ano = a.ano;
            System.out.println("");
            System.out.println("Carro C");
            System.out.println("Marca: "+marca);
            System.out.println("Valor: "+valor);
            System.out.println("Ano:"+ano);
        }
        
        else {
            marca = b.marca;
            valor = b.valor;
            ano = b.ano;
            System.out.println("");
            System.out.println("Carro C");
            System.out.println("Marca: "+marca);
            System.out.println("Valor: "+valor);
            System.out.println("Ano: "+ano);
        }
    }

}
