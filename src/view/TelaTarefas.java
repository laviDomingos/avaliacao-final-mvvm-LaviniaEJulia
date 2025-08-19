package view;

import java.util.Scanner;

public class TelaTarefas {
    private Scanner scanner = new Scanner (System.in);

    public String lerTexto(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    public int lerNumero(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextInt();
    }

     public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}


