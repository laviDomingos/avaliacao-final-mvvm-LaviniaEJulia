package patterns.command;

public class CommandInvocador{
    public void executeCommand(Command command) {
        command.execute();
    }
}
