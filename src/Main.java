import enums.Prioridade;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import vm.TarefaViewModel;

public class Main{

    public static void main (String[] args) {
        TarefaViewModel tarefa = new TarefaViewModel("Estudar Java", "Revisar conceitos de POO", "2023-10-01", "2023-10-02", false, Prioridade.MEDIA);
        TarefaViewModel tarefa1 = new TarefaViewModel("Estudar Python", "Aprender tuplas,dicionário e condicionais", "2025-03-27", "2025-03-28", false, Prioridade.BAIXA);
        TarefaViewModel tarefa2 = new TarefaViewModel("Estudar Arquiteturas padrão", "Revisar conceitos de MVC,MVP E MVVM", "2025-10-10", "2025-10-11", true, Prioridade.ALTA);

   
        
        System.out.println("Título: " + tarefa.getTitulo());
        System.out.println("Descrição: " + tarefa.getDescricao());
        System.out.println("Data de Criação: " + tarefa.getDataCriacao());
        System.out.println("Data de Conclusão: " + tarefa.getDataConclusao());
        System.out.println("Concluída: " + tarefa.isConcluida());
        System.out.println("Prioridade: " + tarefa.getPrioridade());

        System.out.println("");

        System.out.println("Título: " + tarefa1.getTitulo());
        System.out.println("Descrição: " + tarefa1.getDescricao());
        System.out.println("Data de Criação: " + tarefa1.getDataCriacao());
        System.out.println("Data de Conclusão: " + tarefa1.getDataConclusao());
        System.out.println("Concluída: " + tarefa1.isConcluida());
        System.out.println("Prioridade: " + tarefa1.getPrioridade());

        System.out.println("");
         
        System.out.println("Título: " + tarefa2.getTitulo());
        System.out.println("Descrição: " + tarefa2.getDescricao());
        System.out.println("Data de Criação: " + tarefa2.getDataCriacao());
        System.out.println("Data de Conclusão: " + tarefa2.getDataConclusao());
        System.out.println("Concluída: " + tarefa2.isConcluida());
        System.out.println("Prioridade: " + tarefa2.getPrioridade());

        System.out.println("");
        // Como ordernar por prioridade 
       
        List<TarefaViewModel> tarefas = Arrays.asList(tarefa, tarefa1, tarefa2);
        Collections.sort(tarefas, Comparator.comparing(TarefaViewModel::getPrioridade));
        tarefas.forEach(t -> System.out.println(t.getTitulo() + " - " + t.getPrioridade()));
        
    }
}