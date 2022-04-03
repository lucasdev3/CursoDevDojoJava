package acoplamento.test;

import acoplamento.dominio.Funcionario;

public class FuncionarioTest01 {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();

        f1.setNome("Sanji");
        f1.setIdade(23);
        f1.setSalarios(new double[]{1200, 987.32, 2000});
        f1.imprime();
        System.out.println("Média " + f1.getMedia());
    }
}
