package Main.java.List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> LivroList;

    public CatalogoLivros() { this.LivroList = new ArrayList<>(); }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        this.LivroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!LivroList.isEmpty()) {
            for (Livro livro : LivroList) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!LivroList.isEmpty()) {
            for (Livro livro : LivroList) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(livro);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro LivroPorTitulo = null;
        if(!LivroList.isEmpty()) {
            for (Livro livro : LivroList) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    LivroPorTitulo = livro;
                    break;
                }
            }
        }
        return LivroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("O Senhor dos Anéis", "J. R. R. Tolkien", 1954);
        catalogoLivros.adicionarLivro("Fundação", "Isaac Asimov", 1951);
        catalogoLivros.adicionarLivro("O Hobbit", "J. R. R. Tolkien", 1937);
        catalogoLivros.adicionarLivro("O Silmarillion", "J. R. R. Tolkien", 1977);
        catalogoLivros.adicionarLivro("Eu, Robô", "Isaac Asimov", 1950);

        System.out.println(catalogoLivros.pesquisarPorAutor("Isaac Asimov"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1950, 1954));
        System.out.println(catalogoLivros.pesquisarPorTitulo("O Hobbit"));
    }
}


