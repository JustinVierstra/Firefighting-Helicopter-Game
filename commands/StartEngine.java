package org.csc133.a5.commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import org.csc133.a5.GameWorld;

public class StartEngine extends Command {
    private GameWorld gw;

    public StartEngine(GameWorld gw){
        super("Start");
        this.gw=gw;
    }

    @Override
    public void actionPerformed(ActionEvent event){
        gw.startEngine();
    }
}
