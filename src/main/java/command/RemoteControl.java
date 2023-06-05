package command;
import java.util.ArrayList;
import java.util.List;
public class RemoteControl {

    private List<Command> commandList = new ArrayList<Command>();

    public void pressButton(Command command) {
        this.commandList.add(command);
        command.execute();
    }

}
