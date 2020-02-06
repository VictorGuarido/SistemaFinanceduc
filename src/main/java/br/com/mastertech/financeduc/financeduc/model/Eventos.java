package br.com.mastertech.financeduc.financeduc.model;
import javax.persistence.*;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "eventos")
public class Eventos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    @NotBlank
    private String nome;
    @Column
    @NotBlank
    private String email;
    @Column
    @NotBlank
    private String descricao;
    @Column
    @NotBlank
    private String imagem;
    @Column
    @NotBlank
    private String tipo;
    @Column
    @NotBlank
    private String data;
    @Column
    @NotBlank
    private String horario;
    @Column
    private LocalDate dataCriacao;
    @Column
    private Boolean ativo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
