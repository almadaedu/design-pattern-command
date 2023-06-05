

import command.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoteControlTest {
    Light light = new Light("On", "Off");

    RemoteControl remoteControl = new RemoteControl();
    @BeforeEach
    void setUp() {
        remoteControl = new RemoteControl();
        light = new Light("Luzes acesas", "Luzes apagadas");
    }

    @Test
    void lightOnCommand() {
        Command lightOnCommand = new LightOnCommand(light);
        remoteControl.pressButton(lightOnCommand);

        assertEquals("Luzes acesas", light.getMode());
    }

    @Test
    void lightOffCommand() {
        Command lightOffCommand = new LightOffCommand(light);
        remoteControl.pressButton(lightOffCommand);

        assertEquals("Luzes apagadas", light.getMode());
    }
}
