package br.com.moura.domain;

import javax.persistence.*;


@Entity
@Table(name = "cadastro")
public class Cadastro {

    public static final String COD_ID = "id";

    @Id
    @Column(name = COD_ID)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "Endereco")
    private String endereco;

    @Column(name = "Cidade")
    private String cidade;

    @Column(name = "Bairro")
    private String bairro;

    @Column(name = "Cep")
    private String cep;

    @Column(name = "Celular")
    private String celular;

    @Column(name = "DataNasc")
    private String datanasc;

    @Column(name = "Estado")
    private String estado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDataNasc() {
        return datanasc;
    }

    public void setDataNasc(String dataNasc) {
        datanasc = dataNasc;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cadastro)) return false;
        Cadastro that = (Cadastro) o;
        return getId() != null ? getId().equals(that.getId()) : that.getId() == null;
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }

    @Override
    public String toString() {
        String entidade = getClass().getSimpleName();
        return "Entidade [ "+entidade+" ] {" + "id=" + getId() + '}';
    }
}
