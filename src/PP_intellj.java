import model.Gato;

public class PP_intellj {
    public static void main(String[] args){
        Gato gato = new Gato();
        System.out.println(gato);

        Livro Livro1 = new Livro("O problema dos 3 corpos", 300);
         System.out.println(Livro1);

        int a = 5;
        int b = 3;
        System.out.println("Hello World! " + (a+b));
    }
}
class Livro {
    private String nome;
    private String numPaginas;

    public Livro(String s, int i) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(String numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas='" + numPaginas + '\'' +
                '}';
    }
}

