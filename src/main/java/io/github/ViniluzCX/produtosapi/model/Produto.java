package io.github.ViniluzCX.produtosapi.model;

// POJO -> Plain old java object
public class Produto {

    // atributos
    private String id;
    private String nome;
    private String descricao;
    private String preco;

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco='" + preco + '\'' +
                '}';
    }
}
