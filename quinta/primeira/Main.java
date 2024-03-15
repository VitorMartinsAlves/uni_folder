package quinta.primeira;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "João", "joao@email.com", "123456789");
        Curso curso = new Curso(1, "Java Programming", "Curso de programação em Java", 60);

        System.out.println("Informações do Cliente:");
        System.out.println("ID: " + cliente.getId());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Telefone: " + cliente.getTelefone());

        System.out.println("\nInformações do Curso:");
        System.out.println("ID: " + curso.getId());
        System.out.println("Nome: " + curso.getNome());
        System.out.println("Descrição: " + curso.getDescricao());
        System.out.println("Duração: " + curso.getDuracao() + " horas");
    }
}
