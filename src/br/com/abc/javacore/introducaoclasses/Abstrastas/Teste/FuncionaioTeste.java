package br.com.abc.javacore.introducaoclasses.Abstrastas.Teste;

import br.com.abc.javacore.introducaoclasses.Abstrastas.Classes.Funcionario;
import br.com.abc.javacore.introducaoclasses.Abstrastas.Classes.Gerente;
import br.com.abc.javacore.introducaoclasses.Abstrastas.Classes.Vendedor;

public class FuncionaioTeste {
    public static void main(String[] args) {
        Gerente g = new Gerente("Anna","45454545",5000);
        Vendedor f = new Vendedor("Pedro","456456466",2000,50000);
        g.calculaSalario();
        f.calculaSalario();

        System.out.println(g);
        System.out.println(f);
    }
}
