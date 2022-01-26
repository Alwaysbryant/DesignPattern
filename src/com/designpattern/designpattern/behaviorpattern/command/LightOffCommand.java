package com.designpattern.designpattern.behaviorpattern.command;

/**
 * Created by 62691
 * on 2022/1/26 16:44
 *
 * @author swaggyw
 */
public class LightOffCommand implements Command{
    LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.off();
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }
}
