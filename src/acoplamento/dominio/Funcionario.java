package acoplamento.dominio;

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (this.salarios == null) {
            return;
        }
        for (double salario : this.salarios) {
            System.out.println(salario + " ");
        }

        imprimeMediaSalario();
    }

    public void imprimeMediaSalario() {
        if (this.salarios == null) {
            return;
        }
        for (double salario : this.salarios) {
            this.media += salario;
        }
        this.media /= this.salarios.length;

        System.out.println("\nMédia salarial: " + this.media);
    }
}
