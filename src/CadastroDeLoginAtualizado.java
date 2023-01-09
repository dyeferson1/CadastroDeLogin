package logicadeprogramacao.principal;
import java.util.Scanner;

public class CadastroDeLoginAtualizado {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu login de acesso");
        String nome = input.next();
        if (nome.equals("admin") || nome.equals("administrador")) {
            System.out.println("Usuario inválido");
        } else {
            System.out.println(nome + " Login cadastrado com sucesso");

        }
    }
}
