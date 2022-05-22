package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroProgram {
    public static void main(String[] args) {
        Gato gato = new Gato();

        Livro livro = new Livro("bible", 1200);

        System.out.println(livro);

//        int a = 5;
//        int b = 4;
//        System.out.println("Hello World " + (a+b));


    }
}
class Livro{
    private String nome;

   private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}