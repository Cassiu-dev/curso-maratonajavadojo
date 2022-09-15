package AppPessoaEndereco.Teste;

import AppPessoaEndereco.Classe.Endereco;
import AppPessoaEndereco.Classe.Pessoa;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AppPessoaEndereco {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaString= new Scanner(System.in);

        char resp;
        Pessoa p = new Pessoa();
        Endereco end = new Endereco();

        System.out.println("Digite o nome:");
        p.setNome(entradaString.nextLine());
        System.out.println("Digite a idade:");
        p.setIdade(Integer.parseInt(entradaString.nextLine()));
        System.out.println("Digite o sexo:");
        p.setSexo(entrada.next().charAt(0));

        System.out.println("Digite seu endereço");
        end.setLogradouro(entradaString.nextLine());
        System.out.println("Digite o numero");
        end.setNumero(entrada.nextInt());

        System.out.println("Tem complemento?");
        resp= entrada.next().charAt(0);

        if(resp == 's'){
            System.out.println("Digite o complemento");
            end.setComplemento(entradaString.nextLine());
        }else {
            end.setComplemento("");
        }

        System.out.println("Digite o Cep");
        end.setCep(entradaString.nextLine());

        p.setEnd(end);


        p.imprimir();

    }
}
