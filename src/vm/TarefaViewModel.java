package vm;

import enums.Prioridade;

public class TarefaViewModel {
    private String titulo;
    private String descricao;
    private String dataCriacao;
    private String dataConclusao;
    private boolean concluida;
    public final Prioridade prioridade;

    public TarefaViewModel(String titulo, String descricao, String dataCriacao, String dataConclusao, boolean concluida, Prioridade prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.dataConclusao = dataConclusao;
        this.concluida = concluida;
        this.prioridade = prioridade;
    }


    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public String getDataConclusao() {
        return dataConclusao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }
}