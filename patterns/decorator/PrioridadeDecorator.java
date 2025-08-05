package patterns.decorator;

import model.Tarefa;

public class PrioridadeDecorator extends Tarefa {
    private Tarefa tarefaDecorator;

     public PrioridadeDecorator(Tarefa tarefa) {
        super(tarefa.getTitulo(), tarefa.getDescricao(), tarefa.getPrioridade(), tarefa.getPrazo());
        this.tarefaDecorator = tarefa;
    }

    @Override
    public String toString() {
        return tarefaDecorator.toString() + " [DECORADO]";
    }
}

