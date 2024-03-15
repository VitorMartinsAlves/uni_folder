package quinta.segunda_segunda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("**Primeiro Paciente**");
        Paciente paciente1 = new Paciente();

        System.out.print("Nome: ");
        paciente1.setNome(scanner.nextLine());

        System.out.print("RG: ");
        paciente1.setRg(scanner.nextLine());

        System.out.print("Data de Nascimento: ");
        paciente1.setDataNascimento(scanner.nextLine());

        System.out.print("Endereço: ");
        paciente1.setEndereco(scanner.nextLine());

        Telefone telefone1 = new Telefone();

        System.out.print("DDD: ");
        telefone1.setDdd(scanner.nextLine());

        System.out.print("Número: ");
        telefone1.setNumero(scanner.nextLine());

        paciente1.setTelefone(telefone1);

        System.out.print("Profissão: ");
        paciente1.setProfissao(scanner.nextLine());


        System.out.println("Informações do primeiro paciente:");
        System.out.println(paciente1);

        scanner.close();
    }
}
