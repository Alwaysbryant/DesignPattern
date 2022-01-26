package com.designpattern.designpattern.behaviorpattern.command;

/**
 * Created by 62691
 * on 2022/1/26 16:40
 *
 * @author swaggyw
 * 实际执行命令的类，聚合接收者，通过调用接收者的方法来执行命令
 * 开灯命令
 */
public class LightOnCommand implements Command{
    LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
