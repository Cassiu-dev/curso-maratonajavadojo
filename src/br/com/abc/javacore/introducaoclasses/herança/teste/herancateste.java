package br.com.abc.javacore.introducaoclasses.herança.teste;

import br.com.abc.javacore.introducaoclasses.herança.classes.Endereco;
import br.com.abc.javacore.introducaoclasses.herança.classes.Funcionario;
import br.com.abc.javacore.introducaoclasses.herança.classes.Pessoa;

public class herancateste {
    public static void main(String[] args) {

        //Pessoa p = new Pessoa("Adalberto");
        Endereco end = new Endereco();
        Funcionario f = new Funcionario("Adalberto");

        //p.setNome("Gina");
        //p.setCpf("32323232");


        end.setBairro("Jd amalia");
        end.setRua("Rua adelaide");

        f.setNome("Agusto");
        f.setCpf("dsadasdas");
        f.setSalario(15000);
        f.setEndereco(end);

        //p.setEndereco(end);

        //p.print();
        //f.print();
    }

}
