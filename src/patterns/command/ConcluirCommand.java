package patterns.command;

import model.Tarefa;

public class ConcluirCommand implements Command {
    private Tarefa tarefa;

    public ConcluirCommand(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void execute() {
        tarefa.concluir();
        System.out.println("Tarefa '" + tarefa.getTitulo() + "' concluída.");
    }
}
