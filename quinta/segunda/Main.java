package quinta.segunda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**Primeiro Objeto**");
        Produto produto1 = new Produto();

        System.out.print("Digite a marca: ");
        produto1.setMarca(scanner.nextLine());

        System.out.print("Digite o fabricante: ");
        produto1.setFabricante(scanner.nextLine());

        System.out.print("Digite o código de barras: ");
        produto1.setCodBarras(scanner.nextLine());

        System.out.print("Digite o preço: ");
        produto1.setPreco(scanner.nextFloat());

        System.out.println("\n**Segundo Objeto**");
        System.out.print("Digite a marca: ");
        String marca = scanner.nextLine();

        System.out.print("Digite o fabricante: ");
        String fabricante = scanner.nextLine();

        System.out.print("Digite o código de barras: ");
        String codBarras = scanner.nextLine();

        System.out.print("Digite o preço: ");
        float preco = scanner.nextFloat();

        Produto produto2 = new Produto(marca, fabricante, codBarras, preco);

        System.out.println("\n**Dados do Primeiro Objeto**");
        System.out.println(produto1);

        System.out.println("\n**Dados do Segundo Objeto**");
        System.out.println(produto2);
        scanner.close();
    }

}
